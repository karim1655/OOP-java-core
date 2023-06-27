package com.karim.exercises.oop.phonebook;

public class PhoneBookArray implements PhoneBook {
    public static final int MAX_PERSONS = 256;
    Person[] phoneBook;

    /**
     * Attraverso il costruttore, inizializzo il phoneBook con un nuovo array di persone
     * @param phoneBook
     */
    public PhoneBookArray(Person[] phoneBook) {
        this.phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public void addPerson(Person person) {
        for(int i = 0; i < phoneBook.length; i++) {
            if(phoneBook[i] == null) {
                phoneBook[i] = person;
                return;
            }
        }
        throw new IllegalArgumentException("Phonebook is full");
    }

    @Override
    public void removePerson(Person person) {
        for(int i = 0; i < phoneBook.length; i++) {
            if(phoneBook[i].equals(person)){
                phoneBook[i] = null;
                return;
            }
        }
    }

    @Override
    public Person searchByName(String name) {
        for (Person person : phoneBook) {
            if (person != null) {
                if (person.getName().equals(name)) {
                    return person;
                }
            }
        }
        return null;
    }

    @Override
    public Person searchByLastname(String lastname) {
        for (Person person : phoneBook) {
            if (person != null) {
                if (person.getLastname().equals(lastname)) {
                    return person;
                }
            }
        }
        return null;
    }

    @Override
    public Person searchByNumber(String phone) {
        for (Person person : phoneBook) {
            if (person != null) {
                if(person.getPhone().equals(phone)){
                    return person;
                }
            }
        }
        return null;
    }
}
