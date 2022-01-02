package com.example.applicationandroid

import android.os.Bundle;
import android.content.Intent
import android.widget.*
import org.json.JSONException;
import org.json.JSONObject;
import java.net.URL

class CategoriesActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)
        showBtnBack()
        intent.getStringExtra("title")?.let { setHeaderTitle(it) }

        val gridView:GridView = findViewById(R.id.gridView)

        //URL url = new URL("https://djemam.com/epsi/categories.json"); ne marche pas





        val numbers = arrayOf("BUTTON1", "BUTTON2", "BUTTON4", "BUTTON5", "BUTTON6")

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers)


        gridView.adapter = adapter

        gridView.onItemClickListener = AdapterView.OnItemClickListener {
                parent, v, position, id ->
            val newIntent= Intent(application,ProductsListActivity::class.java)
            newIntent.putExtra("json","json")
            startActivity(newIntent)
        }
    }
}