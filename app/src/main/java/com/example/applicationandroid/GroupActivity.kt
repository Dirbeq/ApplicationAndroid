package com.example.applicationandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class GroupActivity: BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group)
        showBtnBack()
        intent.getStringExtra("title")?.let { setHeaderTitle(it) }

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)

        button1.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,StudentActivity::class.java)
            newIntent.putExtra("title","Lambert")
            newIntent.putExtra("NomPrenom","Lambert Mael")
            newIntent.putExtra("Mail","@")
            newIntent.putExtra("Groupe","Groupe ?")
            startActivity(newIntent)
        })

        button2.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,StudentActivity::class.java)
            newIntent.putExtra("title","Pannier")
            newIntent.putExtra("NomPrenom","Pannier Corentin")
            newIntent.putExtra("Mail","@")
            newIntent.putExtra("Groupe","Groupe ?")
            startActivity(newIntent)
        })

    }
}