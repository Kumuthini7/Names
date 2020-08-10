package com.example.myapplication.test.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.test.model.Response
import com.example.myapplication.test.repo.MainRepository


/**
 * Created by Kumuthini.N on 10-08-2020
 */
class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    private val mResponse = MutableLiveData<Response>()

    val response: LiveData<Response>
        get() = mResponse

    fun getResponse() {
        mainRepository.getResponse(
            { Response -> mResponse.value = Response },
            { t -> Log.e("MainActivity", "onFailure: ", t) }
        )
    }
}


