package com.example.newsapp;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void dateTime() throws Exception{
        String expected = "5 hours ago";
        Utils utils = new Utils();
        String actual = utils.dateTime("2021-07-22T14:00:00Z");
        assertEquals(expected, actual);
    }

    @Test
    public void getCountry() throws Exception{
        String expected = "us";
        Utils utils = new Utils();
        String actual = utils.getCountry();
        assertEquals(expected,actual);
    }
}