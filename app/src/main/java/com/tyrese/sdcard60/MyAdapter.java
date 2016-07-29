package com.tyrese.sdcard60;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Tyrese on 2016/7/29.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    private Context context;
    private LayoutInflater mInflater;
    private String[] data;

    public MyAdapter(Context context) {
        this.context = context;
        this.mInflater = LayoutInflater.from(this.context);
        this.data = this.context.getResources().getStringArray(R.array.names);
    }

    @Override
    public MyAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyHolder holder = new MyHolder(mInflater.inflate(android.R.layout.simple_list_item_1, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyHolder holder, int position) {
        holder.mText.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public static class MyHolder extends RecyclerView.ViewHolder {

        TextView mText;

        public MyHolder(View view) {
            super(view);
            mText = (TextView) view.findViewById(android.R.id.text1);
        }
    }
}
