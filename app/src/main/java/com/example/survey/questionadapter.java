package com.example.survey;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.cardview.widget.CardView;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class questionadapter extends BaseAdapter {

    private List<questions> q ;
    private Context context;
    public questionadapter(Context context, List<questions> q) {
        this.context = context;
        this.q = q;
    }

    @Override
    public int getCount() {
        return q.size();
    }

    @Override
    public Object getItem(int i) {
        return q.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.items, viewGroup, false);
        }
        CardView cardView = view.findViewById(R.id.qcardview);

        questions q1 = (questions) getItem(i);
        return view;
    }
}
