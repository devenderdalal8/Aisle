package com.example.aisle.presenter.viewModel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.data.model.LoginResponseModel
import com.example.aisle.domain.useCase.PostLoginUseCase
import com.example.aisle.utils.Resource
import com.example.aisle.utils.Utility
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    @ApplicationContext val context: Context,
    private val loginUseCase: PostLoginUseCase,
) : ViewModel() {
    private val loginResponseLiveData = MutableLiveData<Resource<LoginResponseModel>>()
    val _loginResponseLiveData : LiveData<Resource<LoginResponseModel>>
        get() = loginResponseLiveData

    fun postPhoneNumberApi(data: LoginRequestModel) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                if (Utility.isNetworkAvailable(context)) {
                    val apiResult = loginUseCase.execute(data)
                    loginResponseLiveData.postValue(apiResult)
                } else {
                    loginResponseLiveData.postValue(Resource.Error("Internet is not available"))
                }
            } catch (ex: Exception) {
                loginResponseLiveData.postValue(Resource.Error(ex.message ?: "Error"))
            }
        }
    }

}