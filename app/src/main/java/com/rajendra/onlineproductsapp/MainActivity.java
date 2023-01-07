package com.rajendra.onlineproductsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rajendra.onlineproductsapp.adapter.ProductAdapter;
import com.rajendra.onlineproductsapp.adapter.ProductCategoryAdapter;
import com.rajendra.onlineproductsapp.model.ProductCategory;
import com.rajendra.onlineproductsapp.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecycler, prodItemRecycler;
    ProductAdapter productAdapter;
    TextView bodyproducts;
    List<ProductCategory> productCategoryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bodyproducts = findViewById(R.id.bodyproductslabel);

        productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1, "Trending"));
        productCategoryList.add(new ProductCategory(2, "Most Popular"));
        productCategoryList.add(new ProductCategory(3, "All Body Products"));

        setProductRecycler(productCategoryList);

        BodyProductsList();

    }


    private void setProductRecycler(final List<ProductCategory> productCategoryList){


        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this, productCategoryList);


        productCatRecycler.setAdapter(productCategoryAdapter);



    }

    private void setProdItemRecycler(List<Products> productsList){

        prodItemRecycler = findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        prodItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productsList);
        prodItemRecycler.setAdapter(productAdapter);

    }

    public void BodyProductsList()
    {
        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Avocado Body Butter", "100 gm", "$ 30.00", R.drawable.avocado));
        productsList.add(new Products(2, "Jasmine Body Butter", "100 gm", "$ 30.00", R.drawable.jasmine));
        productsList.add(new Products(3, "Pears Body Butter", "100 gm", "$ 30.00", R.drawable.pears));
        productsList.add(new Products(4, "Plum Body Butter", "100 gm", "$ 35.00", R.drawable.plum));

        setProdItemRecycler(productsList);
    }

    public void FaceProductsList()
    {
        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(5, "Calmomile Face Oila", "100 ml", "$ 30.00", R.drawable.calmomile));
        productsList.add(new Products(6, "Carrot Face Wash", "100 gm", "$ 30.00", R.drawable.carrot));
        productsList.add(new Products(7, "Lemon Face Wash", "100 gm", "$ 30.00", R.drawable.lemon));
        productsList.add(new Products(8, "Pumpkin Face Mask", "100 gm", "$ 35.00", R.drawable.pumpkin));

        setProdItemRecycler(productsList);
    }

    public void FragranceProductsList()
    {
        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(9, "Joy & Jasmine Perfume", "100 ml", "$ 30.00", R.drawable.jj));
        productsList.add(new Products(10, "Kindness & Pear Perfume", "100 ml", "$ 30.00", R.drawable.kp));
        productsList.add(new Products(11, "White Musk Free Perfume", "100 ml", "$ 30.00", R.drawable.wf));
        productsList.add(new Products(12, "White Musk Lover", "100 ml", "$ 35.00", R.drawable.wl));

        setProdItemRecycler(productsList);
    }

    public void HairProductsList()
    {
        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(13, "Moringa Conditioner", "100 ml", "$ 30.00", R.drawable.mc));
        productsList.add(new Products(14, "Moringa Shampoo", "100 ml", "$ 30.00", R.drawable.ms));
        productsList.add(new Products(15, "Tea Tree Conditioner", "100 ml", "$ 30.00", R.drawable.tc));
        productsList.add(new Products(16, "Tea Tree Shampoo", "100 ml", "$ 35.00", R.drawable.ts));

        setProdItemRecycler(productsList);
    }

    public void TrendingProducts()
    {
        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Avocado Body Butter", "100 gm", "$ 30.00", R.drawable.avocado));
        productsList.add(new Products(6, "Carrot Face Wash", "100 gm", "$ 30.00", R.drawable.carrot));
        productsList.add(new Products(11, "White Musk Free Perfume", "100 ml", "$ 30.00", R.drawable.wf));
        productsList.add(new Products(16, "Tea Tree Shampoo", "100 ml", "$ 35.00", R.drawable.ts));

        setProdItemRecycler(productsList);
    }

    public void MostPopularProducts()
    {
        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(7, "Lemon Face Wash", "100 gm", "$ 30.00", R.drawable.lemon));
        productsList.add(new Products(6, "Carrot Face Wash", "100 gm", "$ 30.00", R.drawable.carrot));
        productsList.add(new Products(9, "Joy & Jasmine Perfume", "100 ml", "$ 30.00", R.drawable.jj));
        setProdItemRecycler(productsList);

    }

    public void AllProducts ()
    {
        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Avocado Body Butter", "100 gm", "$ 30.00", R.drawable.avocado));
        productsList.add(new Products(2, "Jasmine Body Butter", "100 gm", "$ 30.00", R.drawable.jasmine));
        productsList.add(new Products(3, "Pears Body Butter", "100 gm", "$ 30.00", R.drawable.pears));
        productsList.add(new Products(4, "Plum Body Butter", "100 gm", "$ 35.00", R.drawable.plum));
        productsList.add(new Products(5, "Calmomile Face Oila", "100 ml", "$ 30.00", R.drawable.calmomile));
        productsList.add(new Products(6, "Carrot Face Wash", "100 gm", "$ 30.00", R.drawable.carrot));
        productsList.add(new Products(7, "Lemon Face Wash", "100 gm", "$ 30.00", R.drawable.lemon));
        productsList.add(new Products(8, "Pumpkin Face Mask", "100 gm", "$ 35.00", R.drawable.pumpkin));
        productsList.add(new Products(9, "Joy & Jasmine Perfume", "100 ml", "$ 30.00", R.drawable.jj));
        productsList.add(new Products(10, "Kindness & Pear Perfume", "100 ml", "$ 30.00", R.drawable.kp));
        productsList.add(new Products(11, "White Musk Free Perfume", "100 ml", "$ 30.00", R.drawable.wf));
        productsList.add(new Products(12, "White Musk Lover", "100 ml", "$ 35.00", R.drawable.wl));
        productsList.add(new Products(13, "Moringa Conditioner", "100 ml", "$ 30.00", R.drawable.mc));
        productsList.add(new Products(14, "Moringa Shampoo", "100 ml", "$ 30.00", R.drawable.ms));
        productsList.add(new Products(15, "Tea Tree Conditioner", "100 ml", "$ 30.00", R.drawable.tc));
        productsList.add(new Products(16, "Tea Tree Shampoo", "100 ml", "$ 35.00", R.drawable.ts));

        setProdItemRecycler(productsList);
    }

    public void bodyProductsClick (View view)
    {
       BodyProductsList();
    }

    public void FaceProductsClick (View view)
    {
        FaceProductsList();
    }

    public void FragrancesClick (View view)
    {
        FragranceProductsList();
    }

    public void HairProductsClick (View view)
    {
        HairProductsList();
    }

    public void categoryClick (View view)
    {
        Toast.makeText(this, "in", Toast.LENGTH_SHORT).show();

        int itemPosition = productCatRecycler.getChildLayoutPosition(view);
        ProductCategory item = productCategoryList.get(itemPosition);
        int id = item.getProductId();

        if( id == 1)
            TrendingProducts();

        else if (id == 2)
            MostPopularProducts();

        else if (id == 3)
            AllProducts();

        Toast.makeText(this, "out", Toast.LENGTH_SHORT).show();
    }


    public void checkoutMain (View view)
    {
        Intent i = new Intent(this, checkout.class);
        startActivity(i);
    }








}
