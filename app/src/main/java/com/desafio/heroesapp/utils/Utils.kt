package com.desafio.heroesapp.utils

object Utils {

    const val PUBLIC_KEY = "ab465030a4be2f0b1f1572f548aa120"
    const val PRIVATE_KEY = "365225abe1380ad33684eb7584749acc210fce03"

    private fun getTs(): String {
        return (System.currentTimeMillis() / 1000).toString()
    }

    private fun getUserHash(): String {
        return Hash.md5(getTs() + PRIVATE_KEY + PUBLIC_KEY)
    }

    fun getParams(): HashMap<String, String> {
        val params = HashMap<String, String>()
        params["ts"] = getTs()
        params["apikey"] = PUBLIC_KEY
        params["hash"] = getUserHash()
        return params
    }
}