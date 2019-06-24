package com.desafio.heroesapp.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface RestInterface {

    @GET("/v1/public/characters")
    fun getHeroes(@QueryMap params: Map<String, String>): Call<ResponseBody>
}