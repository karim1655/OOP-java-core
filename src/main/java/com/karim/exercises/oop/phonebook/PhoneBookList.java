package com.karim.exercises.oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    public static final int MAX_PERSONS = 256;
    ArrayList<Person> phoneBook;

    /**
     * A differenza del phonebook fatto con l'array statico, qui non ci vuole per forza la lunghezza dell'array, dato che l'arraylist è resizable
     * @param phoneBook
     */
    public PhoneBookList(ArrayList<Person> phoneBook) {
        this.phoneBook = new ArrayList<>();
    }


    @Override
    public void addPerson(Person person) {
        if(phoneBook.size() >= MAX_PERSONS) {
            throw new IllegalArgumentException("Phone is full");
        }
        phoneBook.add(person);
    }

    @Override
    public void removePerson(Person person) {
        phoneBook.remove(person);
    }

    @Override
    public Person searchByName(String name) {
        for(Person person : phoneBook) {
            if(person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person searchByLastname(String lastname) {
        for(Person person : phoneBook) {
            if(person.getLastname().equals(lastname)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person searchByNumber(String phone) {
        for(Person person : phoneBook) {
            if(person.getPhone().equals(phone)) {
                return person;
            }
        }
        return null;
    }
}
