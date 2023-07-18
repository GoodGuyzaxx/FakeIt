package my.id.zaxx.fakeit.api

import my.id.zaxx.fakeit.DataItem
import my.id.zaxx.fakeit.ResponseFake
import my.id.zaxx.fakeit.model.Fake
import retrofit2.Response
import retrofit2.http.GET

interface FakeApi {

    @GET("/v1")
    fun getFake(): Response<DataItem>
}