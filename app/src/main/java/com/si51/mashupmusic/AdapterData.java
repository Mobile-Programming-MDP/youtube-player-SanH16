package com.si51.mashupmusic;

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

    }

    @Override
    public int getItemCount() {
        this.dataModelArrayList.size();
        return 0;
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
