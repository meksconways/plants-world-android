package com.meksconways.plantsworld.core.datasource

import com.meksconways.plantsworld.common.model.ApiResult
import com.meksconways.plantsworld.core.model.division.DivisionsResponseModel
import com.meksconways.plantsworld.core.networking.PlantApi
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val apiService: PlantApi
): RemoteDataSource {

    override suspend fun getDivisions(): ApiResult<DivisionsResponseModel> {
        return getResult {
            apiService.getAllDivisions()
        }
    }


    private suspend fun <T> getResult(call: suspend () -> Response<T>): ApiResult<T> {
        return try {
            val result = call()
            val body = result.body()
            if (result.isSuccessful && body != null) {
                return ApiResult.Success(body)
            } else {
                ApiResult.Failure(Exception(result.message()))
            }
        } catch (e: Exception) {
            return ApiResult.Failure(e)
        }


    }


}