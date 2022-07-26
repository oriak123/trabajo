package com.example.presentacionproximate.models

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

data class LoginModel(
    val codeStatus: String,
    @SerializedName("data")
    val _data: String,
    val message: String,
    val status: Boolean
) {
    val dataUser: DataUserModel?
        get() = Gson().fromJson(_data, DataUserModel::class.java)?:   DataUserModel()
}