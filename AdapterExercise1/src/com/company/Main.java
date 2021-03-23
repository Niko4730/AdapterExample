package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ICar> myList = new ArrayList<>();
        myList.add(new Car("XT36888", "Mitsubishi", "Colt", "04_05", 45_000d, CarType.small));

        IStrangeCar strangeCar = new StrangeCar("XT36777","DK", LocalDateTime.now(), 425_000 );
        ICar adaptedCar = new StrangeCarAdapter(strangeCar);
        myList.add(adaptedCar);



        for (ICar ic : myList){
            System.out.println(ic.getPrice());
        }
        CarFactory cf = new CarFactory();
        ICar car = cf.create();
        }

    }
