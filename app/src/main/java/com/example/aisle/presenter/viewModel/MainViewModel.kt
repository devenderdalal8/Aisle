package com.example.aisle.presenter.viewModel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aisle.data.model.NotesResponseModel
import com.example.aisle.data.model.OtpResponseModel
import com.example.aisle.domain.useCase.GetNotesUseCase
import com.example.aisle.utils.Resource
import com.example.aisle.utils.Utility
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    @ApplicationContext val context: Context,
    private val notesUseCase: GetNotesUseCase,
) : ViewModel() {
    private var token: String? = ""
    private val notesResponseLiveData = MutableLiveData<Resource<NotesResponseModel>>()
    val _NotesResponseLiveData: LiveData<Resource<NotesResponseModel>>
        get() = notesResponseLiveData


    fun setToken(token: String) {
        this.token = token
    }

    fun getToken(): String? = token

    fun postNotesApi() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                if (Utility.isNetworkAvailable(context)) {
                    val apiResult = notesUseCase.execute(getToken())
                    notesResponseLiveData.postValue(apiResult)
                } else {
                    notesResponseLiveData.postValue(Resource.Error("Internet is not available"))
                }
            } catch (ex: Exception) {
                notesResponseLiveData.postValue(Resource.Error(ex.message ?: "Error"))
            }
        }
    }

}