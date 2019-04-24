package com.example.bitroll;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oszkar Pap
 * @version 1.0
 * This is the Medication Adapter
 */

public class MedAdapter extends RecyclerView.Adapter<MedAdapter.ViewHolder>{


    private final Context context;
    private List<Medication> medications;
    private final LayoutInflater inflater;
    private OnItemLongClickListener listener;

    public MedAdapter(Context context, List<Medication> medications, LayoutInflater inflater) {
        this.context = context;
        this.medications = medications;
        this.inflater = inflater;
        this.listener = listener;
    }

    public MedAdapter(Context context, List<Medication> medications, OnItemLongClickListener listener) {
        this.context = context;
        this.medications = medications;
        this.inflater= LayoutInflater.from(context);
        this.listener = listener;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view=inflater.inflate(R.layout.row_medication,parent,false);
       ViewHolder holder=new ViewHolder(view);
       return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Medication medication= medications.get(position);
        holder.name.setText(medication.getName());
        holder.agent.setText(medication.getAgent());
        holder.imageView.setImageResource(medication.getImage());
        holder.linearLayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                listener.onItemLongClicked(position);
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return medications.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public final ImageView imageView;
        public final TextView name, agent;
        public final LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            linearLayout= itemView.findViewById(R.id.row_med_layout);
            imageView = itemView.findViewById(R.id.iv);
            name = itemView.findViewById(R.id.Album);
            agent = itemView.findViewById(R.id.Artist);



        }
    }

    public void updateList(List<Medication> newList) {

        medications = new ArrayList<>();
        medications.addAll(newList);
        notifyDataSetChanged();

    }

    public interface OnItemLongClickListener{
        void onItemLongClicked(int position);
    }

}
