package my.id.zaxx.fakeit.repository

import my.id.zaxx.fakeit.api.RetrofitInstance
import my.id.zaxx.fakeit.model.Fake
import retrofit2.Response

class Repository {

    suspend fun getFake(): Response<Fake>{
        return RetrofitInstance.api.getFake()
    }
}