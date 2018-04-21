package com.bmpl.quizapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class QuizActivity : AppCompatActivity() {

    // instance variable
    lateinit var questionsArray : Array<String>
    lateinit var optionsArray : Array<String>
    lateinit var answersArray : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val intent = intent

        var id = intent.getIntExtra("name", 0)

        when(id){
            cButton.id -> {
                    questionsArray = resources.getStringArray(R.array.cQuestions)
                    optionsArray = resources.getStringArray(R.array.cOptions)
                    answersArray = resources.getStringArray(R.array.cAnwers)
            }
            cPlusButton.id ->{

            }
        }

    }
}
