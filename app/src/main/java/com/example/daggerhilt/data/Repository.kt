package com.example.daggerhilt.data

import javax.inject.Inject

class Repository @Inject constructor(private val retrofitObj: ApiService) : absRepository  {
    override suspend fun makeApiCall() {
        println("Making API Call")
        retrofitObj.getDummy()
    }
}