package com.example.saharw.databindingpractice

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.saharw.databindingpractice.databinding.ActivityMainBinding
import com.example.saharw.databindingpractice.entities.TestData

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var mBinding : ActivityMainBinding
    private var mVal = 0
    private lateinit var mTestData: TestData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        initBinding(mBinding)
    }

    private fun initBinding(binding: ActivityMainBinding) {
        Log.d(TAG, "initBinding")

        // create data for binding
        mTestData = TestData("This is test data val", 1)
        binding.data = mTestData

        binding.clickHandler = this
    }

    fun onClick(view: View) {
        Log.d(TAG, "onClick: view.id = ${view.id}")
        when(view.id){
            R.id.btn_test -> {
                Log.d(TAG, "case \"btn_test\"")
                runOnUiThread {
                    mTestData.setStrVal("New Value: ${++mVal}")
                    Toast.makeText(this@MainActivity, "Button clicked!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
