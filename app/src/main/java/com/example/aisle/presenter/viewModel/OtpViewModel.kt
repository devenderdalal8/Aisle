package com.example.aisle.presenter.viewModel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.data.model.LoginResponseModel
import com.example.aisle.data.model.OtpRequestModel
import com.example.aisle.data.model.OtpResponseModel
import com.example.aisle.domain.repository.OtpRepository
import com.example.aisle.domain.useCase.PostOtpUseCase
import com.example.aisle.utils.Resource
import com.example.aisle.utils.Utility
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OtpViewModel @Inject constructor(
    @ApplicationContext private var context: Context?,
    private val otpUseCase: PostOtpUseCase
) :ViewModel() {

    private val otpResponseLiveData = MutableLiveData<Resource<OtpResponseModel>>()
    val _OtpResponseLiveData : LiveData<Resource<OtpResponseModel>>
        get() = otpResponseLiveData

    fun postPhoneNumberApi(data: OtpRequestModel) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                if (Utility.isNetworkAvailable(context)) {
                    val apiResult = otpUseCase.execute(data)
                    otpResponseLiveData.postValue(apiResult)
                } else {
                    otpResponseLiveData.postValue(Resource.Error("Internet is not available"))
                }
            } catch (ex: Exception) {
                otpResponseLiveData.postValue(Resource.Error(ex.message ?: "Error"))
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        context = null
    }

}