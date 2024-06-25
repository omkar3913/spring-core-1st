package org.example;

public class car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        int res = engine.start();
        if (res > 0) {
            System.out.println("Car started in good condition");
        }
    }
}
