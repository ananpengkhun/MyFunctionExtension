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

        val date2 = Date()
        date2.date = 10
        date2.month = 8
        date2.year = 2017

        date2.format()


    }

    fun Date.format() : String{
        val sdf = SimpleDateFormat("yyyy-MM-dd")
        return sdf.format(this)
    }

    fun Date.format2() : String{
        val sdf = SimpleDateFormat("yyyy-M-dd")
        return sdf.format(this)
    }

    fun Date.format3() : String{
        val sdf = SimpleDateFormat("yyyy-MM-d")
        return sdf.format(this)
    }

}
