package com.example.saharw.databindingpractice.ext

import android.databinding.BindingAdapter
import android.util.Log
import android.widget.TextView

val TAG = "BindingExt"

@BindingAdapter("bla")
fun TextView.setBla(txt : String) {
    Log.d(TAG, "setText is called: txt = $txt")
    text = txt
}