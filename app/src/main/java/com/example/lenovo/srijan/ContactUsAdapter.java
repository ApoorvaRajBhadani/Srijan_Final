package com.example.lenovo.srijan;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactUsAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<ContactModel> models;

    public ContactUsAdapter(Context context, ArrayList<ContactModel> models) {
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
            convertView = View.inflate(context, R.layout.contact_card, null);
        }

        ImageView contactImage = convertView.findViewById(R.id.contactcard_photo);
        TextView contactName = convertView.findViewById(R.id.contactcard_name);
        TextView contactDesignation = convertView.findViewById(R.id.contactcard_designation);
        TextView contactPhone = convertView.findViewById(R.id.contactcard_phone);

        final ContactModel model = models.get(position);

        contactImage.setImageResource(model.getImageId());
        contactName.setText(model.getName());
        contactDesignation.setText(model.getDescription());
        contactPhone.setText(model.getPhone());

        return convertView;
    }
}
