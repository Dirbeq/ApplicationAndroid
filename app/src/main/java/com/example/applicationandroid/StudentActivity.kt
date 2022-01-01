package com.example.applicationandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import android.widget.TextView

class StudentActivity : BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        showBtnBack()
        intent.getStringExtra("title")?.let { setHeaderTitle(it) }
        val textViewNomPrenom = findViewById<TextView>(R.id.textViewNomPrenom)
        textViewNomPrenom.text = intent.getStringExtra("NomPrenom")

        val textViewMail = findViewById<TextView>(R.id.textViewMail)
        textViewMail.text = intent.getStringExtra("Mail")

        val textViewGroup = findViewById<TextView>(R.id.textViewGroup)
        textViewGroup.text = intent.getStringExtra("Groupe")
    }
}