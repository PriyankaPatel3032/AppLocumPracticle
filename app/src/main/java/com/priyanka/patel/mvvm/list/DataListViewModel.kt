package com.priyanka.patel.mvvm.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.priyanka.patel.Api.UsesCaseResult
import com.priyanka.patel.Repository.DataListRepository
import com.priyanka.patel.models.Data.DataResponse
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext


open class DataListViewModel(private val storeListRepository: DataListRepository): ViewModel(), CoroutineScope {
    val job = Job()
    override val coroutineContext: CoroutineContext = Dispatchers.Main + job

    val showloding = MutableLiveData<Boolean>()
    val storeData = MutableLiveData<DataResponse>()
    val showerror = MutableLiveData<String>()



    fun getDataList(){

        launch {
            val result = withContext(Dispatchers.IO) {
                storeListRepository.getDataList()
            }

            showloding.value = false
            when(result){
                is UsesCaseResult.Success -> {
                    withContext(Dispatchers.Main){
                        storeData.value= result.data
                    }
                }
                is UsesCaseResult.Failed -> {
                    showerror.value = result.exception.message
                }
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }
}