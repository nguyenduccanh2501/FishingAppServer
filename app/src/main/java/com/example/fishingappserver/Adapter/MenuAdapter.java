package com.example.fishingappserver.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.fishingappserver.Model.Category;
import com.example.fishingappserver.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    Context context;
    List<Category> categoryList;

    public MenuAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.menu_item_layout,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Picasso.with(context)
                .load(categoryList.get(i).Link)
                .into(viewHolder.img_menu);
        viewHolder.txt_menu_name.setText(categoryList.get(i).Name);

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img_menu;
        public TextView txt_menu_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           img_menu=itemView.findViewById(R.id.image_product);
           txt_menu_name=itemView.findViewById(R.id.txt_category_name);
        }
    }
}
