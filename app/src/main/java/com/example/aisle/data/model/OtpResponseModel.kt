package com.example.aisle.data.model

import com.google.gson.annotations.SerializedName

data class OtpResponseModel(
    @SerializedName("token") val token: String?,
) {
    override fun toString(): String {
        return "OtpResponseModel(token='$token')"
    }
}