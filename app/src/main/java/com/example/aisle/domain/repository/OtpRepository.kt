package com.example.aisle.domain.repository


import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.data.model.LoginResponseModel
import com.example.aisle.data.model.OtpRequestModel
import com.example.aisle.data.model.OtpResponseModel
import com.example.aisle.utils.Resource

interface OtpRepository {

    suspend fun postOtpApi(data : OtpRequestModel): Resource<OtpResponseModel>
}