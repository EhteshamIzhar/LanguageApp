package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by ehte6848 on 29-09-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mcolorId;
    public WordAdapter(Activity context, ArrayList<Word> words,int colorId) {
        super(context,0 , words);
        mcolorId = colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word word = getItem(position);
        ImageView img = (ImageView) listItemView.findViewById(R.id.imageView);
        if(word.getImageResourceId()!=0){

            img.setImageResource(word.getImageResourceId());
        }
        else
        {
            img.setVisibility(View.GONE);
        }
        TextView t = (TextView) listItemView.findViewById(R.id.textView);
        t.setText(word.getMiwok());
        TextView t1 = (TextView) listItemView.findViewById(R.id.textView2);
        t1.setText(word.getEnglish());
        View container = listItemView.findViewById(R.id.container);
        int color = ContextCompat.getColor(getContext(),mcolorId);
        container.setBackgroundColor(color);

        return listItemView;

    }
}
