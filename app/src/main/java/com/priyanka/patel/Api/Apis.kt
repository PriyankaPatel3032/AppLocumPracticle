package com.priyanka.patel.Api

import com.priyanka.patel.models.Data.DataResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET


interface Apis {

    @GET("photos")
    fun getData(): Deferred<DataResponse>


}