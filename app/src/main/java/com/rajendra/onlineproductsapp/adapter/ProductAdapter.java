package com.rajendra.onlineproductsapp.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.telecom.Call;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.rajendra.onlineproductsapp.MainActivity;
import com.rajendra.onlineproductsapp.Productdetails;
import com.rajendra.onlineproductsapp.R;
import com.rajendra.onlineproductsapp.model.ProductCategory;
import com.rajendra.onlineproductsapp.model.Products;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    MainActivity context;
    List<Products> productsList;
    Button cartBtn ;
    int position;

    public ProductAdapter(MainActivity context, List<Products> productsList) {
        this.context = context;
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.products_row_item, parent, false);
        return new ProductViewHolder(view, context, productsList);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductViewHolder holder, final int position) {

        holder.prodImage.setImageResource(productsList.get(position).getImageUrl());
        holder.prodName.setText(productsList.get(position).getProductName());
        holder.prodQty.setText(productsList.get(position).getProductQty());
        holder.prodPrice.setText(productsList.get(position).getProductPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            int noOfProducts = 0;
            Button cartBtn = context.findViewById(R.id.cartBtn);;

            @Override
            public void onClick(View view) {

//                Toast.makeText(context, "in", Toast.LENGTH_SHORT).show();

                noOfProducts++;

                Integer p = holder.getAdapterPosition();

                Products t = productsList.get(p);

//                if( p == 0)
//                {
//
//                }
//
//                else if (p == 1)
//                    context.MostPopularProducts();
//
//                else if (p == 2)
//                    context.AllProducts();

//                Toast.makeText(context, p.toString(), Toast.LENGTH_SHORT).show();

                cartBtn.setText("No. of Products: " + noOfProducts);












//                Intent i = new Intent(context, Productdetails.class);
///*
//                Pair[] pairs = new Pair[1];
//                pairs[0] = new Pair<View, String>(holder.prodImage, "image");
//                ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
//               */ context.startActivity(i/*, activityOptions.toBundle()*/);
            }
        });


    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public static final class ProductViewHolder extends RecyclerView.ViewHolder{

        MainActivity context;
        ImageView prodImage;
        TextView prodName, prodQty, prodPrice;
        ImageView addToCart;
        List<Products> productsList;
        Button cartBtn;
        int noOfProducts = 0;

        public ProductViewHolder(@NonNull View itemView, MainActivity context, List<Products> productsList) {
            super(itemView);
            this.context = context;
            addToCart = itemView.findViewById(R.id.cart);
            this.productsList = productsList;
            prodImage = itemView.findViewById(R.id.prod_image);
            prodName = itemView.findViewById(R.id.prod_name);
            prodPrice = itemView.findViewById(R.id.prod_price);
            prodQty = itemView.findViewById(R.id.prod_qty);
            cartBtn = itemView.findViewById(R.id.cartBtn);

        }


//        @Override
//        public void onClick(View view) {
//            Toast.makeText(context, "in", Toast.LENGTH_SHORT).show();
//
//
//        }


    }

}
