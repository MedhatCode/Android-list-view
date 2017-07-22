package com.example.phoenix.contactslistview;

/**
 * Created by Phoenix on 22-Jul-17.
 */

public class Contact {
    private String name;
    private String phone;
    public Contact(String name,String phone){
        this.name=name;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
