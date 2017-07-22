package com.example.phoenix.contactslistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Contact> contacts=new ArrayList<>();

        final ListView list =(ListView)findViewById(R.id.list);

        final ContactAdapter adapter=new ContactAdapter(this,contacts);
        list.setAdapter(adapter);
        Button add=(Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name=(EditText)findViewById(R.id.ename);
                EditText number=(EditText)findViewById(R.id.enumber);
                String nam=name.getText().toString();
                String num=number.getText().toString();
                contacts.add(new Contact(nam,num));
                list.setAdapter(adapter);
                name.setText("");
                number.setText("");
            }
        });
    }
}
