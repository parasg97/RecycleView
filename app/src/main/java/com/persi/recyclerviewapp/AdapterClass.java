package com.persi.recyclerviewapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ListViewHolder>{
    private ArrayList<String > mNames;
    private Context mContext;

    public AdapterClass(ArrayList<String> names, Context context) {
        mNames = names;
        mContext = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
        ListViewHolder listViewHolder=new ListViewHolder(v);
        return listViewHolder;

    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {

        holder.name.setText(mNames.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"Working",Toast.LENGTH_SHORT);
            }
        });

    }




    @Override
    public int getItemCount() {
        return mNames.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        public ListViewHolder(View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.personName);


        }
    }
}
