package com.example.aisle.data.model

import com.google.gson.annotations.SerializedName

data class LoginResponseModel(
    @SerializedName("status") val status: Boolean? = false
) {
    override fun toString(): String {
        return "LoginResponseModel(status=$status)"
    }
}
