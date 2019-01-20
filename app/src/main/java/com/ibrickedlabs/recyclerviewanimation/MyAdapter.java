package com.ibrickedlabs.recyclerviewanimation;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    Context context;
    ArrayList<String> data;

    private  int currentPosition=0;
    public MyAdapter(Context context, ArrayList<String> data) {
        super();
        this.context=context;
        this.data=data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(data.get(position));
        if(position>currentPosition){
            new AnimationUtils().animate(holder,true);
        }
        else{
            new AnimationUtils().animate(holder,false);
        }
        currentPosition=position;

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{


        private TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv);

        }
    }
}
