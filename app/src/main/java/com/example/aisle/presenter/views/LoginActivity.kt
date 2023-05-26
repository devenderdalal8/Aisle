package com.example.aisle.presenter.views

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.aisle.R
import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.databinding.ActivityLoginBinding
import com.example.aisle.presenter.viewModel.LoginViewModel
import com.example.aisle.utils.Constants
import com.example.aisle.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlin.math.log

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    private var mBinding: ActivityLoginBinding? = null
    private val viewModel: LoginViewModel by viewModels()
    private var code: String? = null
    private var phone: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        setOnClickListener()
        setObservers()
    }

    private fun setOnClickListener() {
        mBinding?.btnContinue?.setOnClickListener {
            mBinding?.progress?.setVisibility(true)
            code = mBinding?.etSTDCode?.text.toString()
            phone = mBinding?.etPhoneNumber?.text.toString()
            if (validates(code, phone)) {
                val data = LoginRequestModel(String.format("%s%s", code, phone))
                viewModel.postPhoneNumberApi(data)
            }
        }
    }

    private fun View.setVisibility(isVisible: Boolean = false) {
        this.visibility = if (isVisible) View.VISIBLE else View.GONE
    }

    private fun setObservers() {
        viewModel._loginResponseLiveData.observe(this) {
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
                    Log.d(TAG, "setObservers: ${it.data} + ${it.message}")
                    if (it.data?.status == true) {
                        Intent(this, OtpActivity::class.java).apply {
                            putExtra(Constants.COUNTRY_CODE, code)
                            putExtra(Constants.PHONE_NUMBER, phone)
                        }.apply { startActivity(this) }
                    }else{
                        Toast.makeText(this, "Invalid syntax", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    private fun validates(code: String?, phone: String?): Boolean {
        if (code?.isEmpty() == true) {
            Toast.makeText(this, getString(R.string.code_error), Toast.LENGTH_SHORT).show()
            return false
        }
        if (phone?.isEmpty() == true) {
            Toast.makeText(this, getString(R.string.phone_error), Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: called")
    }
    
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: called")
    }
    
    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: called")
    }
    
    companion object{
        val TAG:String = LoginActivity::class.java.simpleName
    }
}