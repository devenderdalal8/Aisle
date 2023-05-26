package com.example.aisle.data.ApiService

import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.data.model.LoginResponseModel
import com.example.aisle.data.model.NotesResponseModel
import com.example.aisle.data.model.OtpRequestModel
import com.example.aisle.data.model.OtpResponseModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {
    @POST("users/phone_number_login")
    suspend fun postLogin(@Body number: LoginRequestModel): Response<LoginResponseModel>

    @POST("users/verify_otp")
    suspend fun postOtp(@Body number: OtpRequestModel): Response<OtpResponseModel>

    @GET("users/test_profile_list")
    suspend fun getNotesApi(@Header("Authorization") auth : String?) : Response<NotesResponseModel>
}