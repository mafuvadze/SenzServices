package com.score.senzservices;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

/**
 * Created by Anesu on 1/8/2016.
 */
public class ApplicationInfo {
    private String name;
    private boolean isInstalled;
    private double rating;
    private Bitmap icon;
    Context context;

    public ApplicationInfo(Context context, String name, boolean isInstalled, double rating)
    {
        this(context, name, isInstalled, rating, BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher));
    }

    public ApplicationInfo(Context context, String name, boolean isInstalled, double rating, Bitmap icon)
    {
        this.name = name;
        this.isInstalled = isInstalled;
        this.rating = rating;
        this.icon = icon;
        this.context = context;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInstalled() {
        return isInstalled;
    }

    public void setIsInstalled(boolean isInstalled) {
        this.isInstalled = isInstalled;
    }

    public Bitmap getIcon(){
        return icon;
    }

    public void setIcon(Bitmap icon){
        this.icon = icon;
    }
}
