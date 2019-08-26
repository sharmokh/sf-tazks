package com.tazks.app.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    final Long ID = 1L;
    final String FIRST_NAME = "Joe";
    final String LAST_NAME = "Smith";
    Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person();
        person.setId(ID);
        person.setFirstName(FIRST_NAME);
        person.setLastName(LAST_NAME);
    }

    @Test
    public void testGetId() {
        assertEquals(ID, person.getId());
    }

    @Test
    public void testGetFirstName() {
        assertEquals(FIRST_NAME, person.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertEquals(LAST_NAME, person.getLastName());
    }

    @Test
    public void testSetId() {
        Long newId = 2L;
        person.setId(newId);
        assertEquals(newId, person.getId());
        assertEquals(FIRST_NAME, person.getFirstName());
    }

    @Test
    public void testSetFirstName() {
        String newFristName = "Jane";
        person.setFirstName(newFristName);
        assertEquals(ID, person.getId());
        assertEquals(newFristName, person.getFirstName());
    }

    @Test
    public void testSetLastName() {
        String newLastName = "Newman";
        person.setLastName(newLastName);
        assertEquals(ID, person.getId());
        assertEquals(newLastName, person.getLastName());
    }
}