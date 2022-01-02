package com.example.applicationandroid

import android.os.Bundle

class ProductsListActivity : BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productslist)
        showBtnBack()
        intent.getStringExtra("title")?.let { setHeaderTitle(it) }

    }
}