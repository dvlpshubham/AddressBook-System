package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Contacts> personDetail;

    public AddressBookMain() {
        personDetail = new ArrayList<Contacts>();
    }

    // add new person record to array list after taking input

    public void addPerson() {
        System.out.println("Enter the First Name");
        String firstName = scanner.next();
        System.out.println("Enter the Last Name");
        String lastName = scanner.next();
        System.out.println("Enter the Address");
        String address = scanner.next();
        System.out.println("Enter the City");
        String city = scanner.next();
        System.out.println("Enter the State");
        String state = scanner.next();
        System.out.println("Enter the Zip Code");
        String zip = scanner.next();
        System.out.println("Enter the PhoneNumber");
        String phoneNumber = scanner.next();
        System.out.println("Enter the Email");
        String emailId = scanner.next();
        // constructor creation
        Contacts contacts = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, emailId);

        // adding the above list to to Contacts array list
        personDetail.add(contacts);

        // printing contacts data inside
        System.out.println(contacts);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program in AddressBookMain class");
        AddressBookMain ab = new AddressBookMain();
        ab.addPerson();
    }

}


