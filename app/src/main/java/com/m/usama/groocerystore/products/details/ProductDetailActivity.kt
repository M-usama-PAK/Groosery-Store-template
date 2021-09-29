package com.m.usama.groocerystore.products.details

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.m.usama.groocerystore.R
import com.m.usama.groocerystore.cart.CartActivity

class ProductDetailActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_single_item)
        val ivCart: ImageView = findViewById(R.id.ivCart)
        ivCart.setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }
    }
}