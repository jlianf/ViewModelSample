package com.jalian.viewmodelactivity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val counter: MutableLiveData<Int> = MutableLiveData(0)

    fun getCounter() : MutableLiveData<Int> = counter

    fun countUp(){
        this.counter.value = this.counter.value?.plus(1)
    }

    fun countDown(){
        this.counter.value = this.counter.value?.minus(1)
    }

}