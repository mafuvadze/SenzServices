package com.score.senzservices;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Anesu on 1/8/2016.
 */
public class AppListAdapter extends ArrayAdapter {
    ArrayList<ApplicationInfo> apps;
    Context context;
    int resource;

    public AppListAdapter(Context context, int resource, ArrayList<ApplicationInfo> apps) {
        super(context, resource);
        this.apps = apps;
        this.apps = apps;
        this.context = context;
        this.resource = resource;
    }

    @Override
    public int getCount() {
        return apps.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ApplicationInfo info = apps.get(position);
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(resource, parent, false);
            holder = new ViewHolder();
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.icon = (ImageView) convertView.findViewById(R.id.icon);
        holder.name = (TextView) convertView.findViewById(R.id.name);
        holder.ratingBar = (RatingBar) convertView.findViewById(R.id.rating);
        holder.action_btn = (Button) convertView.findViewById(R.id.action);

        holder.icon.setImageBitmap(info.getIcon());
        holder.name.setText(info.getName());
        holder.ratingBar.setRating((float) info.getRating());

        if (info.isInstalled()) {
            holder.action_btn.setText("UNINSTALL");
            holder.action_btn.setBackgroundResource(R.color.Red);
        }

        return convertView;
    }

    static class ViewHolder
    {
        TextView name;
        Button action_btn;
        RatingBar ratingBar;
        ImageView icon;
    }
}
