package com.lesson_three.papin.hoomeworkthree

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_rectangle.*

class rectangleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        val re = Rectangle()
        fun checkField():Boolean{
            if(hside.text.isEmpty() || wside.text.isEmpty()) {
                Snackbar.make(rectangleScreen, "Input Side", Snackbar.LENGTH_LONG).show()
                return false
            }
            return true
        }
        getSButton.setOnClickListener{
            if(checkField()){
                areaResult.text = re.getS(hside.text.toString().toDouble(), wside.text.toString().toDouble()).toString()
            }
        }
        getPButton.setOnClickListener{
            if(checkField()){
                perimResult.text = re.getP(hside.text.toString().toDouble(), wside.text.toString().toDouble()).toString()
            }
        }
    }
}
