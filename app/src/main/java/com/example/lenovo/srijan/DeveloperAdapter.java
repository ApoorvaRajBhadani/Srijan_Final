package com.example.lenovo.srijan;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DeveloperAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<DeveloperModel> models;

    public DeveloperAdapter(Context context, ArrayList<DeveloperModel> models) {
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.developer_card, null);
        }

        ImageView developerImage = convertView.findViewById(R.id.developercard_photo);
        TextView developerName = convertView.findViewById(R.id.developercard_name);
        TextView developerDescription = convertView.findViewById(R.id.developercard_description);
        ImageView linkedinButton = convertView.findViewById(R.id.developercard_linkedin);
        ImageView githubButton = convertView.findViewById(R.id.developercard_github);
        ImageView instagramButton = convertView.findViewById(R.id.developercard_instagram);
        ImageView facebookButton = convertView.findViewById(R.id.developercard_facebook);


        final DeveloperModel model = models.get(position);

        developerImage.setImageResource(model.getImageId());
        developerName.setText(model.getName());
        developerDescription.setText(model.getDescription());

        linkedinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = model.getLinkedinUrl();
                    context.startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.linkedin.com/profile/view?id="+url)));

            }
        });

        githubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = model.getGithubUrl();
                if (!url.startsWith("https://") && !url.startsWith("http://")) {
                    url = "http://" + url;
                }
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                context.startActivity(i);
            }
        });
        String name = model.getName();
        if(name=="Kuldeep Gautum"||name=="Adarsh Pandey"||name=="Sujay Kaushik")
            githubButton.setVisibility(View.GONE);

        instagramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://instagram.com/_u/" + model.getInstagramUrl());
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    context.startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    context.startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/xxx")));
                }
            }
        });

        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/" + model.getFacebookUrl())));

            }
        });

        return convertView;
    }
}
