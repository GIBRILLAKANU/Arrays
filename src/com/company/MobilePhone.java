//package com.company;
//import java.util.ArrayList;
//
//public class MobilePhone {
//    private String myNumber;
//    private ArrayList<Contact> myContact;
//
//    public MobilePhone(String myNumber){
//        this.myNumber = myNumber;
//        this.myContact= new ArrayList<Contact>();
//    }
//    public boolean  addNewContact(Contact contact){
//        if (!(findContact(contact.getName()) >= 0)) {
//            myContact.add(contact);
//            return true;
//        } else {
//            System.out.println("Contact is already on file");
//            return false;
//        }
//    }
//    public void updateContact(Contact oldContact, Contact newContact){
//        int found
//    }
//    private int findContact(Contact contact){
//        return this.myContact.indexOf(contact);
//
//    }
//    private void findContact(String contactName){
//        for (int i = 0; i<this.myContact.size(); i++);
//        int i;
//        Contact contact = this.myContact.get(i);
//        if (contact.getName().equals(contactName)){
//            return i;
//        }
//    }
//    return -1;
//}
//public String queryContact(Contact contact){
//    if (findContact(contact) >=0){
//        return contact.getName();
//    }
//    return null;
//}
//}
//
