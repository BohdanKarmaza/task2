package com.company.vehicles;

public class Lorry extends Car{
    public void lorry(String loadCapacity){
        this.loadCapacity = loadCapacity;
    }




    private String loadCapacity;
    public String getLoadCapacity(){
        return this.loadCapacity;
    }
    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public static void turnLeft(){
        System.out.println("Slowing down");
        System.out.println("Turning left!");
    }

    public static void turnRight() {
        System.out.println("Slowing down");
        System.out.println("Turning right!");
    }
}
