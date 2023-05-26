package com.example.aisle.domain.useCase

import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.data.model.LoginResponseModel
import com.example.aisle.domain.repository.LoginRepository
import com.example.aisle.utils.Resource
import javax.inject.Inject

class PostLoginUseCase @Inject constructor(
    private val loginRepository: LoginRepository,
) {

    suspend fun execute(data: LoginRequestModel): Resource<LoginResponseModel> {
        return loginRepository.postLoginPhone(data)
    }
}