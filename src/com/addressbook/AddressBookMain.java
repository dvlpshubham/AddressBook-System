package com.addressbook;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    static List<Contacts> list = new LinkedList<Contacts>();

    //Created method for adding contact
    public static void addContact()
    {
        System.out.println("Enter your firstName : ");
        String firstName = sc.nextLine();
        System.out.println("Enter your lastName : ");
        String lastName = sc.nextLine();
        System.out.println("Enter your address : ");
        String address = sc.nextLine();
        System.out.println("Enter your city : ");
        String city = sc.nextLine();
        System.out.println("Enter your state : ");
        String state = sc.nextLine();
        System.out.println("Enter your pin : ");
        String pin = sc.nextLine();
        System.out.println("Enter your MobileNo : ");
        String MobileNo = sc.nextLine();
        System.out.println("Enter your email : ");
        String email = sc.nextLine();
        Contacts obj = new Contacts(firstName, lastName,address, city, state, pin, MobileNo, email);
        list.add(obj);
    }


    public static void editContact()
    {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name for confirmation : ");
        String firstName = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName))
            {
                list.remove(i);
                addContact();
                System.out.println("Successfully Edit data");
            }
            else {
                System.out.println("No data found in Address Book");
            }
        }
    }
    public static void deletePerson() {

        System.out.println("Enter the name to search and delete");
        String s = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Contacts p = list.get(i);
            if (s.equals(p.getFirstName())) {
                list.remove(i);
            }
        }
        System.out.println("contact after deletion");
        if (list.isEmpty() != true)
            System.out.println(list);
        else {
            System.out.println("contacts deleted");
        }
    }


    public static void main(String[] args) {

        AddressBookMain addressBook = new AddressBookMain();
        //Displaying the welcome message
        System.out.println("WELCOME TO ADDRESS BOOK PROBLEM");
        //Adding new contact
        System.out.println("Enter details of new contact");
        addContact();
        //Editing Contact
        editContact();
        // Deleting Contact
        deletePerson();

        System.out.println(list); //printing list
    }
}
