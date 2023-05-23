package com.ocolak;

public class MySingleton {
    private int counter;
    private static final MySingleton instance = new MySingleton();

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        return instance;
    }

    public int incrementCounter() {
        counter++;
        return counter;
    }
}
