package com.example.aisle.data.model

import com.google.gson.annotations.SerializedName

data class OtpRequestModel(
    @SerializedName("number") val number: String?,
    @SerializedName("otp") val otp: String?,
) {
}