package com.desafio.heroesapp.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

object Rest {

    private var restAdapter: Retrofit? = null

    private val rest: RestInterface
        get() {
            if (restAdapter == null) {
                restAdapter = RestApi.init()
            }
            return restAdapter?.create(RestInterface::class.java)!!
        }

    fun callHeroesList(params: HashMap<String, String>, handler: (it: Any?) -> Unit) {
        rest.getHeroes(params).enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                handler(response.body())
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                handler(t)
            }
        })
    }
}