package com.example.counterapplication.ui.theme
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel():ViewModel(){
    private val repository: counterRepository=counterRepository()
    private val Count= mutableStateOf(repository.getCounter().count)
    //Expose the count as immmutable state
    val count:MutableState<Int> =Count
    fun increment(){
        repository.incrementCounter()
        count.value= repository.getCounter().count
    }
    fun decrement(){
        repository.decrementCounter()
        count.value= repository.getCounter().count
    }






}