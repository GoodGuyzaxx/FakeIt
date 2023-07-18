package my.id.zaxx.fakeit.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
const val baseUrl = "https://fakerapi.it/api/"
//    val api: FakeApi by lazy {
//        Retrofit.Builder()
//            .baseUrl(baseUrl)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }

    fun getApi(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getApiService(): FakeApi{
        return getApi().create(FakeApi::class.java)
    }
}