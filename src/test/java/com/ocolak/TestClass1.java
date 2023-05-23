package com.ocolak;

import org.junit.jupiter.api.Test;


public class TestClass1 {


    @Test
    public void testMethod1() {
        MySingleton instance = MySingleton.getInstance();
        System.out.println("TestClass1 - Test Method 1 " + instance.incrementCounter());

    }

    @Test
    public void testMethod2() {
        MySingleton instance = MySingleton.getInstance();
        System.out.println("TestClass1 - Test Method 2 " + instance.incrementCounter());
    }
}