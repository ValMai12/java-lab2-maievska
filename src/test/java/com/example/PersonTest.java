
package com.example;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void equalsAndHashCodeFollowContract() {
        EqualsVerifier.forClass(Person.class).verify();
    }

    @Test
    void equalPersonsHaveSameHashCode() {
        Person first = new Person("Ivanov", "Ivan", 20);
        Person second = new Person("Ivanov", "Ivan", 20);

        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    void differentLastNamesAreNotEqual() {
        Person first = new Person("Ivanov", "Ivan", 20);
        Person second = new Person("Petrov", "Ivan", 20);

        assertNotEquals(first, second);
    }

    @Test
    void differentFirstNamesAreNotEqual() {
        Person first = new Person("Ivanov", "Ivan", 20);
        Person second = new Person("Ivanov", "Petr", 20);

        assertNotEquals(first, second);
    }

    @Test
    void differentAgesAreNotEqual() {
        Person first = new Person("Ivanov", "Ivan", 20);
        Person second = new Person("Ivanov", "Ivan", 21);

        assertNotEquals(first, second);
    }

    @Test
    void personIsEqualToItself() {
        Person person = new Person("Ivanov", "Ivan", 20);

        assertEquals(person, person);
    }

    @Test
    void personIsNotEqualToNullOrOtherType() {
        Person person = new Person("Ivanov", "Ivan", 20);

        assertNotEquals(person, null);
        assertNotEquals(person, "Ivanov Ivan");
    }
}
