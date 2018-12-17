package com.lesson_three.papin.hoomeworkthree

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    val listOfItems = arrayOf("Select Shape", "Circle", "Rectangle", "Triangle")
    var spinner: Spinner? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = this.dropdownlist
        spinner!!.onItemSelectedListener = this

        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, listOfItems)
            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner!!.adapter = aa

    }
    override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
        val circleIntent = Intent(this, circleActivity::class.java)
        val rectangleIntent = Intent(this, rectangleActivity::class.java)
        val triangleIntent = Intent(this, TriangleActivity::class.java)
        when(position){
            1 -> startActivity(circleIntent)
            2 -> startActivity(rectangleIntent)
            3 -> startActivity(triangleIntent)
            else -> {
                return
            }
        }
    }

    override fun onNothingSelected(arg0: AdapterView<*>) {

    }
}
