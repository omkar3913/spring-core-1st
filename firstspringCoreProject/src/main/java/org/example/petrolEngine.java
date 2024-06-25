package org.example;

public class petrolEngine implements Engine {
    @Override
    public int start() {
        System.out.println("Petrol engine started");
        return 1;
    }
}
