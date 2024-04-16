package com.example.daggerhilt.di

import com.example.daggerhilt.data.ApiService
import com.example.daggerhilt.data.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofitObject():ApiService{
        return Retrofit.Builder().baseUrl("https://www.abc.com").build().create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun providesRepository(retrofitObj : ApiService):Repository{
                return Repository(retrofitObj)
    }

}