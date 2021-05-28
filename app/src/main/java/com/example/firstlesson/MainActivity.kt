package com.example.firstlesson

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var resultText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultText = findViewById(R.id.resultText)

    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.button0 -> {
                Log.d("sss", "1 Button Clicked")
                buttonClick('0')

            }
            R.id.button1 -> {
                Log.d("sss", "1 Button Clicked")
                buttonClick('1')

            }
            R.id.button2 -> {
                Log.d("sss", "2 Button Clicked")
                buttonClick('2')

            }
            R.id.button3 -> {
                Log.d("sss", "3 Button Clicked")
                buttonClick('3')

            }
            R.id.button4 -> {
                Log.d("sss", "1 Button Clicked")
                buttonClick('4')


            }
            R.id.button5 -> {
                Log.d("sss", "2 Button Clicked")
                buttonClick('5')

            }
            R.id.button6 -> {
                Log.d("sss", "3 Button Clicked")
                buttonClick('6')

            }
            R.id.button7 -> {
                Log.d("sss", "1 Button Clicked")
                buttonClick('7')

            }
            R.id.button8 -> {
                Log.d("sss", "2 Button Clicked")
                buttonClick('8')
            }
            R.id.button9 -> {
                Log.d("sss", "3 Button Clicked")
                buttonClick('9')

            }
            R.id.buttonPlus -> {
                Log.d("sss", "3 Button Clicked")
                buttonClick('+')

            }
            R.id.buttonMinus -> {
                Log.d("sss", "3 Button Clicked")
                buttonClick('-')

            }
            R.id.buttonMultiple -> {
                Log.d("sss", "3 Button Clicked")
                buttonClick('*')

            }
            R.id.buttonEqual -> {
                Log.d("sss", "3 Button Clicked")
                buttonClick('=')

            }
        }
    }

   private fun buttonClick(char: Char) {
        if (char=='='){
           var text = resultText?.text?.toString()
            Log.d("result",text?:"")
            var firstText = ""
            var secondText = ""
            var oparationText:Char?=null
            text?.forEach {
                if (it.isDigit()){
                   if (oparationText==null) {
                       firstText+=it.toString()
                   }else{
                       secondText+=it.toString()
                   }
                }else{
                    oparationText = it
                }
            }
            Log.d("sss",firstText)
            Log.d("sss",oparationText.toString())
            Log.d("sss",secondText)
            calculate(firstText.toInt(),oparationText,secondText.toInt())
        }else{
            resultText?.text =   resultText?.text?.toString()?.plus(char.toString())
        }
    }
    fun calculate(firstNumber:Int, oparationChar: Char?,secondNumber:Int){
       when(oparationChar){
           '-'->{
               resultText?.text = (firstNumber-secondNumber).toString()
           }
           '+'->{
               resultText?.text = (firstNumber+secondNumber).toString()
           }
       }

    }


}