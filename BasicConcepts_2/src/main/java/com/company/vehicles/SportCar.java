package com.company.vehicles;

public class SportCar extends Car{
    private String maxSpeed;
    public String getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void sportCar(String maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public static void start(){
        System.out.println("Warming up!");
        System.out.println("Let's go!");
    }
}
