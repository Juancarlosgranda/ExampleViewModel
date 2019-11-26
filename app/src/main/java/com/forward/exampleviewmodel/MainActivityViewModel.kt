package com.forward.exampleviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private val input = MutableLiveData<String>()

    fun setInput(x: String){
        input.value = x
    }

    fun getInput(): LiveData<String> {
        return input
    }

}