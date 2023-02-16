package com.example.habitwith

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface AlimentoService {
    @GET("code")
    /*@GET("generic_name")
    @GET("allergens")*/
    fun fetchAllPosts(): Call<List<Alimento>>

}