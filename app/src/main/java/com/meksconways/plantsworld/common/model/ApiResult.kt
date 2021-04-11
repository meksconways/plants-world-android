package com.meksconways.plantsworld.common.model

sealed class ApiResult<T> {
    data class Success<T>(val result: T) : ApiResult<T>()
    data class Failure<T>(val exception: Exception) : ApiResult<T>()

}

fun ApiResult<*>.isSuccess(): Boolean = (this is ApiResult.Success && this.result != null)
fun ApiResult.Failure<*>.getMessage(): String = this.exception.localizedMessage ?: "Something went wrong"