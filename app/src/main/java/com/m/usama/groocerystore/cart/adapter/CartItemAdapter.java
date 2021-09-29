package com.m.usama.groocerystore.cart.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.m.usama.groocerystore.R;
import com.m.usama.groocerystore.products.Model.ProductItemModel;
import com.m.usama.groocerystore.products.details.ProductDetailActivity;

import java.util.ArrayList;


public class CartItemAdapter extends RecyclerView.Adapter<CartItemAdapter.RecyclerViewHolder> {

    private ArrayList<ProductItemModel> productListData;
    private Context mcontext;

    public CartItemAdapter(ArrayList<ProductItemModel> productListData, Context mcontext) {
        this.productListData = productListData;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate Layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_cart_item, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        // Set the data to textview and imageview.
        ProductItemModel recyclerData = productListData.get(position);
    }

    @Override
    public int getItemCount() {
        // this method returns the size of recyclerview
        return productListData.size();
    }

    // View Holder Class to handle Recycler View.
    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout llAddRemove;
        ImageView tvMinus;
        TextView tvCount;
        ImageView tvPlus;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            llAddRemove = itemView.findViewById(R.id.llAddRemove);
            tvPlus = itemView.findViewById(R.id.tvPlus);
            tvCount = itemView.findViewById(R.id.tvCount);
            tvMinus = itemView.findViewById(R.id.tvMinus);


            tvPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int val = Integer.parseInt(tvCount.getText().toString())+1;
                   tvCount.setText((String.valueOf(val)));
                }
            });

            tvMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int val = Integer.parseInt(tvCount.getText().toString())-1;
                    tvCount.setText(((String.valueOf(val))));
                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mcontext.startActivity(new Intent(mcontext, ProductDetailActivity.class));
                }
            });

        }
    }
}

