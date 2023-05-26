package com.example.aisle.data.repository.dataSource

import com.example.aisle.data.model.OtpRequestModel
import com.example.aisle.data.model.OtpResponseModel
import retrofit2.Response

interface OtpRemoteDataSource {
    suspend fun postOtpCode(data: OtpRequestModel) : Response<OtpResponseModel>
}