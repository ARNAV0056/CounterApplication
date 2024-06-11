package com.example.counterapplication.ui.theme

data class CounterModel(var count:Int)
class counterRepository{
    private var Counter=CounterModel(0)
    fun getCounter()=Counter
    fun incrementCounter(){
        Counter.count++
    }
    fun decrementCounter(){
        Counter.count--
    }
}