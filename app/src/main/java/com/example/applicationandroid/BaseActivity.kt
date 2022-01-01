package com.example.applicationandroid

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    fun showBtnBack(){
        val imageViewBack=findViewById<ImageView>(R.id.imageViewReturn)
        imageViewBack.visibility=View.VISIBLE
        imageViewBack.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

    fun setHeaderTitle(txt : String){
        val textViewTitle = findViewById<TextView>(R.id.textViewTitle)
        textViewTitle.text = txt
    }

}