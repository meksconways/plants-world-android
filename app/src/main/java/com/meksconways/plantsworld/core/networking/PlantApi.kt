package com.meksconways.plantsworld.core.networking

import com.meksconways.plantsworld.core.model.division.DivisionsResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface PlantApi {

    @GET("divisions")
    suspend fun getAllDivisions(): Response<DivisionsResponseModel>



}