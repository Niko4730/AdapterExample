package com.company;

import java.time.LocalDateTime;

public interface IStrangeCar {

    String getLicense();
    void setLicense(String licensePlate);

    String getCountry();
    void setCountry(String country);

    LocalDateTime getFactoryDate();
    void setFactoryDate(LocalDateTime time);

    float getPriceInDKK();
    void setPriceInDKK(float price);


}
