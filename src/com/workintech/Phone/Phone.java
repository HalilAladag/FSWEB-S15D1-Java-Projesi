package com.workintech.Phone;

import java.util.ArrayList;

public class Phone {
    private String myNumbers;
    private ArrayList<Contact> myContacts;

    public Phone(String myNumber) {
        this.myNumbers = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(!myContacts.contains(contact)){
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(myContacts.contains(oldContact)){
            oldContact.setName(newContact.getName());
            oldContact.setPhoneNumber(newContact.getPhoneNumber());
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    public int findContact(String contactName){
        for(Contact contact: myContacts){
            if(contact.getName().equals(contactName)){
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName){
        for(Contact contact: myContacts){
            if(contact.getName().equals(contactName)){
                return contact;
            }
        }
        return null;
    }

    public void printContact(){
        for(int i = 0; i< myContacts.size(); i++){
            System.out.println(i + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
