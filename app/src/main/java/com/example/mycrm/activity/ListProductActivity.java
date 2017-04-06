package com.example.mycrm.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mycrm.R;
import com.example.mycrm.adapter.ProductListAdapter;
import com.example.mycrm.model.Product;
import com.example.mycrm.model.Products;

public class ListProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_products);

        setProductData();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.list_product);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        ProductListAdapter adapter = new ProductListAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    private void setProductData() {
        Products.getProducts().add(new Product("Nokia0","телефон0"));
        Products.getProducts().add(new Product("Nokia1","телефон1"));
        Products.getProducts().add(new Product("Nokia2","телефон2"));
        Products.getProducts().add(new Product("Nokia3","телефон3"));
        Products.getProducts().add(new Product("Nokia4","телефон4"));
        Products.getProducts().add(new Product("Nokia5","телефон5"));
        Products.getProducts().add(new Product("Nokia6","телефон6"));
        Products.getProducts().add(new Product("Nokia7","телефон7"));
        Products.getProducts().add(new Product("Nokia8","телефон8"));
        Products.getProducts().add(new Product("Nokia9","телефон9"));
        Products.getProducts().add(new Product("Nokia10","телефон10"));




    }
}
