package com.airtribe.studentmanagement.util;

public interface Registrable {

    String getRegistrationDetails();

    default void printRegistrationType() {
        System.out.println("Standard registration process");
    }
}
