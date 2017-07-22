package com.example.phoenix.contactslistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Phoenix on 22-Jul-17.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {
    ContactAdapter(Context context, ArrayList<Contact> arr){super(context,0,arr);}

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItem = convertView;
        if(listItem==null){
            listItem= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Contact contact=getItem(position);
        TextView name=(TextView)listItem.findViewById(R.id.name);
        TextView phone=(TextView)listItem.findViewById(R.id.number);
        name.setText(contact.getName());
        phone.setText(contact.getPhone());

        return listItem;
    }
}
