package com.example.mycrm.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mycrm.R;
import com.example.mycrm.model.Product;
import com.example.mycrm.model.Products;


public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ViewHolder>{
    private Context context;
    private LayoutInflater inflater;

    public ProductListAdapter(Context context) {
        this.context = context;
        this.inflater =LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= inflater.inflate(R.layout.fragment_list_product_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Product product =Products.getProducts().get(position);
        holder.txtProductName.setText(product.getName());
        holder.txtProductType.setText(product.getType());
    }

    @Override
    public int getItemCount() {
        return Products.getProducts().size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        final TextView txtProductName, txtProductType;
        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            txtProductName = (TextView) itemView.findViewById(R.id.txtProductName);
            txtProductType = (TextView) itemView.findViewById(R.id.txtProductType);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
