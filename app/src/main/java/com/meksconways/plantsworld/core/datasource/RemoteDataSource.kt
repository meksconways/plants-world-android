package com.meksconways.plantsworld.core.datasource

import com.meksconways.plantsworld.common.model.ApiResult
import com.meksconways.plantsworld.core.model.division.DivisionsResponseModel
import retrofit2.Response

interface RemoteDataSource {


    suspend fun getDivisions(): ApiResult<DivisionsResponseModel>



}