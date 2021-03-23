package com.company;

public class CarFactory{
    public ICar create(String licensePlate, String make, String model, String yearMonth, double price, CarType carType){

        return new Car();
    }

}
