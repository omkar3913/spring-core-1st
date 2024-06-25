package org.example;

public class dieselEngine implements Engine {
    @Override
    public int start() {
        System.out.println("Diesel engine started");
        return 1;
    }
}
