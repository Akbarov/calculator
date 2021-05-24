package com.example.firstlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClick(view:View){
        when(view.id){
            R.id.button1->{
                Log.d("sss","1 Button Clicked")
                Toast.makeText(baseContext,"First Button clicked",Toast.LENGTH_SHORT).show()

            }
            R.id.button2->{
                Log.d("sss","2 Button Clicked")

            }
            R.id.button3->{
                Log.d("sss","3 Button Clicked")

            }
        }

    }

}