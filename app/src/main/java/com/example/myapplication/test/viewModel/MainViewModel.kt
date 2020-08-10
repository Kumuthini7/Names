package com.example.myapplication.test.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.test.model.NameList
import com.example.myapplication.test.model.Response
import com.example.myapplication.test.repo.MainRepository
import java.lang.String


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

    fun addAlphabets(list: List<kotlin.String>): ArrayList<NameList>? {
        var i = 0
        val editedNameList: ArrayList<NameList> = ArrayList<NameList>()
        val nameList = NameList()
        nameList.name = String.valueOf(list[0][0])
        nameList.type = 1
        editedNameList.add(nameList)
        i = 0
        while (i < list.size - 1) {
            val name = NameList()
            val name1: Char = list[i][0]
            val name2: Char = list[i + 1][0]

            if (name1 == name2) {
                name.type = (2)
                name.name = list[i]
                editedNameList.add(name)
            } else {
                editedNameList.add(NameList(name = list[i], type = 2))

                name.name = (name2.toString())
                name.type = (1)
                editedNameList.add(name)
            }
            i++
        }
        return editedNameList
    }

}


