package com.example.saharw.databindingpractice.entities

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.example.saharw.databindingpractice.BR

data class TestData(private var strVal : String, private var intVal : Int) : BaseObservable() {

    @Bindable
    fun getStrVal() : String {
        return strVal
    }

    @Bindable
    fun getIntVal() : Int {
        return intVal
    }

    fun setStrVal(newValue : String) {
        this@TestData.strVal = newValue
        notifyPropertyChanged(BR.strVal)
    }

    fun setIntVal(newValue : Int) {
        this@TestData.intVal = newValue
        notifyPropertyChanged(BR.intVal)
    }
}