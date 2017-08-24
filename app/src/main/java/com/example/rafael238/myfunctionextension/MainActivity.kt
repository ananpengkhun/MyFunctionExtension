package com.example.rafael238.myfunctionextension

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        plus()
//        minus()



//        tv_date.text = date.format()
    }

    fun Date.format() : String{
        val sdf = SimpleDateFormat("yyyy-MM-dd")
        return sdf.format(this)
    }

//    private fun minus() = 5-5
//
//    fun plus()  = 5+5
}
