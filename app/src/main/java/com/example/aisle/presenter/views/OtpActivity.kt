package com.example.aisle.presenter.views

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.aisle.R
import com.example.aisle.data.model.OtpRequestModel
import com.example.aisle.databinding.ActivityOtpBinding
import com.example.aisle.presenter.viewModel.OtpViewModel
import com.example.aisle.utils.Constants
import com.example.aisle.utils.Constants.TOKEN
import com.example.aisle.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OtpActivity : AppCompatActivity() {
    private var mBinding: ActivityOtpBinding? = null
    val viewModel: OtpViewModel by viewModels()
    private var phoneNumber: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_otp)
        initializeView()
        startTimer()
        setOnClickListener()
        initializeObserver()
    }

    private fun View.setVisibility(isVisible: Boolean = false) {
        this.visibility = if (isVisible) View.VISIBLE else View.GONE
    }


    private fun initializeView() {
        phoneNumber = String.format(
            "%s%s",
            intent.getStringExtra(Constants.COUNTRY_CODE),
            intent.getStringExtra(Constants.PHONE_NUMBER)
        )
        mBinding?.tvGetNumber?.text = phoneNumber
    }

    private fun startTimer() {
        val totalTimeInMills = 60000L
        val countDownTimer = object : CountDownTimer(totalTimeInMills, 1000) {
            override fun onTick(p0: Long) {
                val secondReminders = p0 / 1000
                mBinding?.tvTimer?.text = "00:${secondReminders}"
            }

            override fun onFinish() {
                val otp = mBinding?.etEnterOTPCode?.text.toString()
                if (validation(otp)) {
                    val data = OtpRequestModel(phoneNumber, otp)
                    mBinding?.progress?.setVisibility(true)
                    viewModel.postPhoneNumberApi(data)
                }
            }

        }
        countDownTimer.start()
    }

    private fun setOnClickListener() {
        mBinding?.btnContinue?.setOnClickListener {
            mBinding?.progress?.setVisibility(true)
            val otp = mBinding?.etEnterOTPCode?.text.toString()
            if (validation(otp)) {
                val data = OtpRequestModel(phoneNumber, otp)
                viewModel.postPhoneNumberApi(data)
            }
        }

        mBinding?.tvGetNumber?.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }

    private fun initializeObserver() {
        viewModel._OtpResponseLiveData.observe(this) {
            when (it) {
                is Resource.Error -> {
                    mBinding?.progress?.setVisibility(false)
                    it.message?.let { message ->
                        Toast.makeText(this, "An error occurred $message", Toast.LENGTH_LONG).show()
                    }
                }

                is Resource.Loading -> {
                    mBinding?.progress?.setVisibility(true)
                }

                is Resource.Success -> {
                    mBinding?.progress?.setVisibility(false)
                    if (it.data?.token?.isNotEmpty() == true) {
                        Intent(this, MainActivity::class.java).apply {
                            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
                            putExtra(TOKEN, it.data.token)
                        }.apply {
                            startActivity(this)
                        }
                    } else {
                        Toast.makeText(this, "Invalid syntax", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    private fun validation(otp: String): Boolean {
        if (otp.isEmpty()) {
            Toast.makeText(this, getString(R.string.otp_error), Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }


    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}
