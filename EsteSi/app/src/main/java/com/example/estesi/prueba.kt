package com.example.estesi

import com.google.gson.annotations.SerializedName

data class UserInfo (
    @SerializedName("user") val user: String?,
    @SerializedName("password") val password: String?,

    )