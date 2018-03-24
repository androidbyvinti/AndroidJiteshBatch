package com.bmpl.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var firstNumber = 0
    var operator = ""
    var secondNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(view : View){// View class
        var button = findViewById<Button>(view.id)  // 2
        inputTextView.text = inputTextView.text.toString() + button.text

        if(operator.isNotEmpty()){
                            // 69+58
            secondNumber = inputTextView.text.toString().substringAfterLast(operator).toInt()

            resultTextView.text = when(operator){
                "+"-> (firstNumber + secondNumber).toString()
                "-"-> (firstNumber - secondNumber).toString()
                "X"-> (firstNumber * secondNumber).toString()
                "/"-> (firstNumber / secondNumber).toString()
                else-> ""
            }
            firstNumber = resultTextView.text.toString().toInt()
        }

    }

    fun operationRequested(view:View){
        var button = findViewById<Button>(view.id)
        if(operator.isEmpty())  // 45+87+54
            firstNumber = inputTextView.text.toString().toInt()
        operator =  button.text.toString()

        inputTextView.text = inputTextView.text.toString() + button.text
    }
}
