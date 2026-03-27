package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");

        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");

        list.addCity(edmonton);
        assertTrue(list.hasCity(edmonton));

        list.deleteCity(edmonton);

        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testCountCitiesInitiallyZero() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());
    }

    @Test
    public void testCountCitiesAfterAddingCities() {
        CustomList list = new CustomList();
        City c1 = new City("Calgary", "AB");
        City c2 = new City("Edmonton", "AB");

        list.addCity(c1);
        list.addCity(c2);

        assertEquals(2, list.countCities());
    }
}