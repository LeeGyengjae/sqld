package com.example.sqld.activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.sqld.R

class HelloActivity:Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        var i = 0
        var button = findViewById<Button>(R.id.first)
        var img = findViewById<ImageView>(R.id.imageView01)
        button.setOnClickListener(){
            i = 1 - i;
            if( i == 0){
                img.setImageResource(R.drawable.page010103)
            }else{
                img.visibility=View.INVISIBLE
            }
        }
    }
}