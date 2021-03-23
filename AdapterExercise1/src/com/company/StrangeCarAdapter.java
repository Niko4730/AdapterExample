package com.company;

public class StrangeCarAdapter implements ICar {
    private IStrangeCar strangeCar;

    public StrangeCarAdapter(IStrangeCar strangeCar) {
        this.strangeCar = strangeCar;
    }

    @Override
    public String getLicensePlate() {
        return strangeCar.getLicense();
    }

    @Override
    public String getMake() {
        return "Unknown";
    }

    @Override
    public String getModel() {
        return "Unknown";
    }

    @Override
    public String getYearMonth() {
        return "" + strangeCar.getFactoryDate().getYear() + "-" + strangeCar.getFactoryDate().getMonth();
    }

    @Override
    public double getPrice() {
        return Double.valueOf(strangeCar.getPriceInDKK());
    }

    @Override
    public void setPrice(double price) {
        strangeCar.setPriceInDKK((float) price);

    }
}
