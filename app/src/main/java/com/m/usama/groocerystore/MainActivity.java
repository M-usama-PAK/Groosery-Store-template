package com.m.usama.groocerystore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jackandphantom.carouselrecyclerview.CarouselRecyclerview;
import com.m.usama.groocerystore.home.adapter.RecyclerViewAdapter;
import com.m.usama.groocerystore.home.model.RecyclerData;
import com.m.usama.groocerystore.view.CenterZoomLayoutManager;

import java.util.ArrayList;

public class MainActivity extends Activity {
    ImageView menu_icon_IV, ivCart;

    Button forward_btn;

    EditText etSearch; //etSearchMain

    TextView best_values_tv_ID, top_sellers_tv_ID, categories_tv_ID, popular_tv_ID, Whatsnew_tv_ID;

    RecyclerView rvOfferBanners, rvCategories;
    private ArrayList<RecyclerData> recyclerDataArrayList;
    CarouselRecyclerview carouselRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu_icon_IV = findViewById(R.id.menu_icon_IV);
        ivCart = findViewById(R.id.ivCart);
        forward_btn = findViewById(R.id.forward_btn);
        etSearch = findViewById(R.id.etSearch);
        best_values_tv_ID = findViewById(R.id.best_values_tv_ID);
        top_sellers_tv_ID = findViewById(R.id.top_sellers_tv_ID);
        popular_tv_ID = findViewById(R.id.popular_tv_ID);
        Whatsnew_tv_ID = findViewById(R.id.Whatsnew_tv_ID);
        categories_tv_ID = findViewById(R.id.categories_tv_ID);
        rvCategories = findViewById(R.id.rvCategories);

        // Offers recycler view
        //    rvOfferBanners = findViewById(R.id.rvOfferBanners);
        carouselRecyclerview = findViewById(R.id.rvOfferBanners);
        carouselRecyclerview.set3DItem(true);
        carouselRecyclerview.setInfinite(true);
        carouselRecyclerview.setIntervalRatio(0.8f);

    /*    rvOfferBanners.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,
                false));
        */
        //   rvOfferBanners.setLayoutManager(new CenterZoomLayoutManager(this,LinearLayoutManager.HORIZONTAL,
        //         false));
        recyclerDataArrayList = new ArrayList<RecyclerData>();
        recyclerDataArrayList.add(new RecyclerData("Tomato", R.drawable.vegitables));
        recyclerDataArrayList.add(new RecyclerData("potato", R.drawable.vegitables));
        recyclerDataArrayList.add(new RecyclerData("onion", R.drawable.vegitables));
        recyclerDataArrayList.add(new RecyclerData("carot", R.drawable.vegitables));
        recyclerDataArrayList.add(new RecyclerData("chili", R.drawable.vegitables));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(recyclerDataArrayList, this);

        // at last set adapter to recycler view.
        carouselRecyclerview.setAdapter(adapter);

        //Catgories recyclerview
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        rvCategories.setLayoutManager(layoutManager);
        rvCategories.setAdapter(adapter);


    }

}