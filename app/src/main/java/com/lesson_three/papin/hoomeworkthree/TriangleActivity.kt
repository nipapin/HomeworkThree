package com.lesson_three.papin.hoomeworkthree

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_triangle.*

class TriangleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)
        val tr = Triangle()
       fun checkField():Boolean{
           if(aSide.text.isEmpty() || bSide.text.isEmpty() || cSide.text.isEmpty()) {
            Snackbar.make(triangleScreen, "Input Side", Snackbar.LENGTH_LONG).show()
            return false
           }
           return true
       }
        getSButton.setOnClickListener{
            if(checkField()){
                areaResult.text = tr.getS(aSide.text.toString().toDouble(), bSide.text.toString().toDouble(), cSide.text.toString().toDouble()).toString()
            }
        }
        getPButton.setOnClickListener{
            if(checkField()){
                perimResult.text = tr.getP(aSide.text.toString().toDouble(), bSide.text.toString().toDouble(), cSide.text.toString().toDouble()).toString()
            }
        }
    }
}
