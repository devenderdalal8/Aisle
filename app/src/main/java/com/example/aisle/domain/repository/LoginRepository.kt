package com.example.aisle.domain.repository


import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.data.model.LoginResponseModel
import com.example.aisle.utils.Resource

interface LoginRepository {

    suspend fun postLoginPhone(data : LoginRequestModel): Resource<LoginResponseModel>
}