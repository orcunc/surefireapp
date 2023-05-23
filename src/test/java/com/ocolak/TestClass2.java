package com.ocolak;

import org.junit.jupiter.api.Test;


public class TestClass2 {

    @Test
    public void testMethod3() {
        MySingleton instance = MySingleton.getInstance();
        System.out.println("TestClass2 - Test Method 3 " + instance.incrementCounter());
    }

    @Test
    public void testMethod4() {
        MySingleton instance = MySingleton.getInstance();
        System.err.println("TestClass2 - Test Method 4 " + instance.incrementCounter());
    }
}