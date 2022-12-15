package com.si51.mashupmusic;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterData extends RecyclerView.Adapter<AdapterData.DataViewHolder>{
    private ArrayList<DataModel> dataModelArrayList;

    public AdapterData(ArrayList<DataModel> dataModelArrayList) {
        this.dataModelArrayList = dataModelArrayList;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        DataModel dataModel = dataModelArrayList.get(position);

        holder.tvJudul.setText(dataModel.getJudul());
        holder.tvKeterangan.setText(dataModel.getKeterangan());
        holder.tvVideoid.setText(dataModel.getVideoid());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String judul = dataModelArrayList.get(holder.getBindingAdapterPosition()).getJudul();
                String keterangan = dataModelArrayList.get(holder.getBindingAdapterPosition()).getKeterangan();
                String videoid = dataModelArrayList.get(holder.getBindingAdapterPosition()).getVideoid();

                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("varJudul", judul);
                intent.putExtra("varKeterangan", keterangan);
                intent.putExtra("varVideoid", videoid);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul, tvKeterangan, tvVideoid;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvKeterangan = itemView.findViewById(R.id.tv_keterangan);
            tvVideoid = itemView.findViewById(R.id.tv_videoid);
        }
    }
}
