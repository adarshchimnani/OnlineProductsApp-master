package com.rajendra.onlineproductsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rajendra.onlineproductsapp.MainActivity;
import com.rajendra.onlineproductsapp.R;
import com.rajendra.onlineproductsapp.model.ProductCategory;

import org.w3c.dom.Text;

import java.util.List;

public class ProductCategoryAdapter extends RecyclerView.Adapter<ProductCategoryAdapter.ProductViewHolder> {

    MainActivity context;
    List<ProductCategory> productCategoryList;


    public ProductCategoryAdapter(MainActivity context, List<ProductCategory> productCategoryList) {
        this.context = context;
        this.productCategoryList = productCategoryList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View view = LayoutInflater.from(context).inflate(R.layout.category_row_item, parent, false);

        return new ProductViewHolder(view, context, productCategoryList);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        holder.catagoryName.setText(productCategoryList.get(position).getProductName());

    }

    @Override
    public int getItemCount() {
        return productCategoryList.size();
    }


    public static final class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        TextView catagoryName;
        MainActivity context;
        List<ProductCategory> productCategoryList;

        public ProductViewHolder(@NonNull View itemView, MainActivity context, List<ProductCategory> productCategoryList) {
            super(itemView);
            this.context = context;
            this.productCategoryList = productCategoryList;
            catagoryName = itemView.findViewById(R.id.cat_name);
            catagoryName.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Integer p = getAdapterPosition();

       //     ProductCategory t = productCategoryList.get(p);

            if( p == 0)
                context.TrendingProducts();

            else if (p == 1)
                context.MostPopularProducts();

            else if (p == 2)
                context.AllProducts();

          //  Toast.makeText(context, t.getProductName(), Toast.LENGTH_SHORT).show();


        }
    }

}
