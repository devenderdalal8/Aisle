package com.example.aisle.data.repository.dataSourceImpl

import com.example.aisle.data.ApiService.ApiService
import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.data.model.LoginResponseModel
import com.example.aisle.data.repository.dataSource.LoginRemoteDataSource
import retrofit2.Response
import javax.inject.Inject

class LoginRemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService,
) : LoginRemoteDataSource {
    override suspend fun postPhoneNumber(data: LoginRequestModel): Response<LoginResponseModel> {
        return apiService.postLogin(data)
    }

}