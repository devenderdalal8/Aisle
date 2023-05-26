package com.example.aisle.data.repository.dataSource

import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.data.model.LoginResponseModel
import retrofit2.Response

interface LoginRemoteDataSource {
    suspend fun postPhoneNumber(data: LoginRequestModel): Response<LoginResponseModel>
}