package com.example.aisle.data.repository.dataSourceImpl

import com.example.aisle.data.ApiService.ApiService
import com.example.aisle.data.model.OtpRequestModel
import com.example.aisle.data.model.OtpResponseModel
import com.example.aisle.data.repository.dataSource.OtpRemoteDataSource
import retrofit2.Response
import javax.inject.Inject

class OtpRemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
): OtpRemoteDataSource {
    override suspend fun postOtpCode(data: OtpRequestModel): Response<OtpResponseModel> {
        return apiService.postOtp(data)
    }
}