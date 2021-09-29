package com.m.usama.groocerystore.products

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.m.usama.groocerystore.R
import com.m.usama.groocerystore.products.Model.ProductItemModel
import com.m.usama.groocerystore.products.adapter.ProductsListAdapter
import java.util.*
import kotlin.collections.ArrayList

class ProductsListActivity : Activity() {
    private val productListData: ArrayList<ProductItemModel> = ArrayList()
    lateinit var rvProducts: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_list)

        populateTempData()

        val adapter = ProductsListAdapter(productListData, this)

        // at last set adapter to recycler view.

        // at last set adapter to recycler view.
        rvProducts = findViewById(R.id.rvProducts)
        val layoutManager = GridLayoutManager(this, 2)
        rvProducts.setLayoutManager(layoutManager)
        rvProducts.adapter = adapter


    }

    private fun populateTempData() {
        for (i in 0..10) {
            productListData?.add(ProductItemModel("Apple", R.drawable.apple, false, 10, 1))
        }
    }
}