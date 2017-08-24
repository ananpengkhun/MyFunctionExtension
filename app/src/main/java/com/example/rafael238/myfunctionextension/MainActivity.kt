package com.example.rafael238.myfunctionextension

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus()
        minus()

    }

    private fun minus() = 5-5

    fun plus()  = 5+5
}
