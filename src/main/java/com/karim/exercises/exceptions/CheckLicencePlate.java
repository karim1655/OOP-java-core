package com.karim.exercises.exceptions;

public class CheckLicencePlate {
    public static void checkLicencePlate(String licence) {
        if(!Character.isLetter(licence.charAt(0)))
            throw new IllegalArgumentException();
        if(!Character.isLetter(licence.charAt(1)))
            throw new IllegalArgumentException();
        if(!Character.isDigit(licence.charAt(2)))
            throw new IllegalArgumentException();
        if(!Character.isDigit(licence.charAt(3)))
            throw new IllegalArgumentException();
        if(!Character.isDigit(licence.charAt(4)))
            throw new IllegalArgumentException();
        if(!Character.isLetter(licence.charAt(5)))
            throw new IllegalArgumentException();
        if(!Character.isLetter(licence.charAt(6)))
            throw new IllegalArgumentException();
    }
}
