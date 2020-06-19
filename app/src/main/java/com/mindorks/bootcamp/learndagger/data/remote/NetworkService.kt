package com.mindorks.bootcamp.learndagger.data.remote

import com.mindorks.bootcamp.learndagger.data.remote.request.DummyRequest
import com.mindorks.bootcamp.learndagger.data.remote.response.DummyResponse
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST


interface NetworkService {

    @POST(Endpoints.DUMMY)
    fun doDummyCall(
        @Body request : DummyRequest,
        @Header(Networking.HEADER_API_KEY) apiKey:String = Networking.API_KEY
    ): Single<DummyResponse>

}
