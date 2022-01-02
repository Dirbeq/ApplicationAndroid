package com.example.applicationandroid

import android.os.Bundle

class ProductsDetailsActivity : BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productsdetails)
        showBtnBack()
        intent.getStringExtra("title")?.let { setHeaderTitle(it) }

    }
}