package com.example.lenovo.srijan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class adapterimage extends PagerAdapter {
    Context mtcx;
    List<String> imagesList;

    public adapterimage(Context mtcx, List<String> imagesList) {
        this.mtcx = mtcx;
        this.imagesList = imagesList;
    }

    @Override
    public int getCount() {
        return imagesList.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        String images = imagesList.get(position);
        LayoutInflater inflater = (LayoutInflater)mtcx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slidingimages,null);
        ImageView imageView = (ImageView)view.findViewById(R.id.image);
        Picasso.get().load(images).placeholder(R.drawable.logosrijan).fit().into(imageView);
        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view, 0);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }
}
