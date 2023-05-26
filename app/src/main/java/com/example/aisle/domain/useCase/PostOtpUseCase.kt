package com.example.aisle.domain.useCase

import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.data.model.LoginResponseModel
import com.example.aisle.data.model.OtpRequestModel
import com.example.aisle.data.model.OtpResponseModel
import com.example.aisle.domain.repository.LoginRepository
import com.example.aisle.domain.repository.OtpRepository
import com.example.aisle.utils.Resource
import javax.inject.Inject

class PostOtpUseCase @Inject constructor(
    private val otpRepository: OtpRepository,
) {

    suspend fun execute(data: OtpRequestModel):Resource<OtpResponseModel> {
        return otpRepository.postOtpApi(data)
    }
}