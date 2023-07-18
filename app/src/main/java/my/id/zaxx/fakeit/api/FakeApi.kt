package my.id.zaxx.fakeit.api

import my.id.zaxx.fakeit.model.Fake
import retrofit2.Response
import retrofit2.http.GET

interface FakeApi {

    @GET("/custom?_quantity=1&name=name")
    suspend fun getFake(): Response<Fake>
}