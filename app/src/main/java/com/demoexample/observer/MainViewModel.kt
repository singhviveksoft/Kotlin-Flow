package com.demoexample.observer

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class MainViewModel:ViewModel() {

  //  var _count =MutableLiveData<Int>()

     var _count =MutableStateFlow<Int>(0)
    val count get() = _count


    fun increaseCount(){

        var i=2
        var c=i++
        _count.value=c
    }

    fun dcreaseCount(){
        _count.value=-1
    }


}