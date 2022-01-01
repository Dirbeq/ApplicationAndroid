package com.example.applicationandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button1:Button = findViewById(R.id.Zone_1)
        val button2:Button = findViewById(R.id.Zone_2)

        button1.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,GroupActivity::class.java)
            newIntent.putExtra("title","Infos")
            startActivity(newIntent)
        })

        button2.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,GroupActivity::class.java)
            startActivity(newIntent)
        })

    }
}