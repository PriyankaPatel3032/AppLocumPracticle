package com.priyanka.patel.Repository

import com.priyanka.patel.Api.Apis
import com.priyanka.patel.Api.UsesCaseResult
import com.priyanka.patel.models.Data.DataResponse


interface DataListRepository {
    suspend fun getDataList(): UsesCaseResult<DataResponse>
}

class DataListRepositoryImpl(private val apis: Apis): DataListRepository {
    override  suspend fun getDataList(): UsesCaseResult<DataResponse> {
        val result = apis.getData().await()
        return try {
            UsesCaseResult.Success(result)
        }catch (e: Exception){
            UsesCaseResult.Failed(e)
        }
    }


}
