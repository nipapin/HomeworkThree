package com.lesson_three.papin.hoomeworkthree

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_circle.*

class circleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        val ci = Circle()
        fun checkField():Boolean{
            if(radius.text.isEmpty()) {
                Snackbar.make(circleScreen, "Input Side", Snackbar.LENGTH_LONG).show()
                return false
            }
            return true
        }
        getSButton.setOnClickListener{
            if(checkField()){
                areaResult.text = ci.getS(radius.text.toString().toDouble()).toString()
            }
        }
        getCButton.setOnClickListener{
            if(checkField()){
                perimResult.text = ci.getC(radius.text.toString().toDouble()).toString()
            }
        }

    }
}
