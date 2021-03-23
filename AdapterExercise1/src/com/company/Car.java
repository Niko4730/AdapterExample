package com.company;

import com.sun.jdi.CharType;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Car implements ICar, Printable {

    private String licensePlate;
    private String make;
    private String model;
    private String yearMonth;
    private double price;
    private CarType carType;

    public Car(String licensePlate, String make, String model, String yearMonth, double price, CarType carType) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.yearMonth = yearMonth;
        this.price = price;
        this.carType = carType;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print() {

    }
}
