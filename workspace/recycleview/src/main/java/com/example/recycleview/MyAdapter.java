package com.example.recycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class MyAdapter extends RecyclerView.Adapter {

    private  CellData [] data = {new CellData("title1","content1"),new CellData("title2","content2")};

    class ViewHolder extends RecyclerView.ViewHolder{
        private View root;
        private  TextView tvTitle,tvContent;


        public ViewHolder(View root){
            super(root);
            tvTitle = root.findViewById(R.id.tvTitle);
            tvContent = root.findViewById(R.id.tvContent);
        }

        public TextView getTvTitle() {
            return tvTitle;
        }

        public TextView getTvContent() {
            return tvContent;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell,null));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ViewHolder viewHolder = (ViewHolder) holder;
        CellData cellData = data[position];
            viewHolder.getTvTitle().setText(cellData.getTitle());
            viewHolder.getTvContent().setText(cellData.getContent());
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
}
