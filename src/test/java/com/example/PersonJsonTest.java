
package com.example;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonJsonTest {

    @Test
    void jsonContainsAllFields() {
        Person person = new Person("Ivanov", "Ivan", 20);
        Gson gson = new Gson();

        String json = gson.toJson(person);

        assertTrue(json.contains("\"lastName\":\"Ivanov\""));
        assertTrue(json.contains("\"firstName\":\"Ivan\""));
        assertTrue(json.contains("\"age\":20"));
    }

    @Test
    void personCanBeRestoredFromJson() {
        Person original = new Person("Ivanov", "Ivan", 20);
        Gson gson = new Gson();

        String json = gson.toJson(original);
        Person restored = gson.fromJson(json, Person.class);

        assertEquals(original, restored);
        assertNotSame(original, restored);
    }
}
