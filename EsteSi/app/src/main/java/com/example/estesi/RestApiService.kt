package com.example.estesi

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestApiService {
    fun addUser(userData: UserInfo, onResult: (UserResponse?) -> Unit){
        val retrofit = MainActivity.ServiceBuilder.buildService(RestApi::class.java)
        retrofit.addUser(userData).enqueue(
            object : Callback<UserResponse> {
                override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                    onResult(null)
                }

                override fun onResponse(
                    call: Call<UserResponse>,
                    response: Response<UserResponse>
                ) {
                    onResult(response.body()!!)
                }
            }
        )
    }

    fun getProducts(userData: tokenGener, onResult: (valor?) -> Unit){
        val retrofit = MainActivity.ServiceBuilder.buildService(RestApi::class.java)
        retrofit.getProducts(userData).enqueue(
            object : Callback<valor> {
                override fun onFailure(call: Call<valor>, t: Throwable) {
                    onResult(null)
                }

                override fun onResponse(call: Call<valor>, response: Response<valor>) {
                    onResult(response.body()!!)
                }
            }
        )
    }
}