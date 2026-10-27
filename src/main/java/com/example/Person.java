
package com.example;

import java.util.Objects;

public final class Person {
    private final String lastName;
    private final String firstName;
    private final int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Person other)) {
            return false;
        }

        return age == other.age
                && Objects.equals(lastName, other.lastName)
                && Objects.equals(firstName, other.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, age);
    }
}
