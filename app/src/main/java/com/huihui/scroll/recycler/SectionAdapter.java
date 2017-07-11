package com.huihui.scroll.recycler;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by LK on 2017/6/16.
 * 动脑学院 版权所有
 */

public class SectionAdapter extends RecyclerView.Adapter<SectionAdapter.ViewHolder> {

    int DEFAULT_COUNT = 20;
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_section, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
         holder.bind();
    }

    @Override
    public int getItemCount() {
        return DEFAULT_COUNT;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
       RecyclerView rvHorizontal;
       LinearLayoutManager layoutManager;
       public ViewHolder(View itemView) {
           super(itemView);
           rvHorizontal = (RecyclerView)itemView.findViewById(R.id.rv_horizontal);
           layoutManager = new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false);
           rvHorizontal.setLayoutManager(layoutManager);
           rvHorizontal.setAdapter(new FakeAdapter(R.layout.item_card_hor));
       }

       public void bind() {
           layoutManager.scrollToPosition(0);
       }
   }
}
