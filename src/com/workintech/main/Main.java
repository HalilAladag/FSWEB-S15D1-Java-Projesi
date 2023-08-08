package com.workintech.main;

import com.workintech.Phone.Contact;

import com.workintech.Phone.Phone;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone("541541541541");
        phone.addNewContact(new Contact("Bob", "31415926"));
        phone.printContact();
        phone.addNewContact(new Contact("Alice", "6180339"));
        phone.printContact();
        phone.addNewContact(new Contact("Tom", "11235813"));
        phone.printContact();
        phone.addNewContact(new Contact("Jane", "23571113"));
        phone.printContact();
    }
}