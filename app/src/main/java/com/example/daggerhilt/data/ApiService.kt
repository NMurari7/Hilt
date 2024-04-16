package com.example.daggerhilt.data

import retrofit2.http.GET

interface ApiService {
    @GET("abc")
    suspend fun getDummy()
}