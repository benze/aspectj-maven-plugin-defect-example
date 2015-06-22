package de.scrum_master.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {
    @Test
    public void testMain() throws Exception {
        Application.main("foo");
    }

    @Test
    public void testOne() throws Exception {
        System.out.println("Test one");
    }

    @Test
    public void testTwo() throws Exception {
        System.out.println("Test two");
    }
}
