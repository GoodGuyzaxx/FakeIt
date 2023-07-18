package my.id.zaxx.fakeit.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: FakeApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://fakerapi.it/api/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FakeApi::class.java)
    }
}