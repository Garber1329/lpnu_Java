package com.company.Task11;

public class Taxi {
    Driver driver;
    protected String brand;
    protected int numberplate;
    protected String colour;

    public Taxi(final String brand, final int numberplate, final String colour ){
        this.brand = brand;
        this.numberplate = numberplate;
        this.colour = colour;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Taxi taxi = (Taxi) o;

        if (numberplate != taxi.numberplate) return false;
        if (driver != null ? !driver.equals(taxi.driver) : taxi.driver != null) return false;
        return brand != null ? brand.equals(taxi.brand) : taxi.brand == null;
    }

    @Override
    public int hashCode() {
        int result = driver != null ? driver.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + numberplate;
        return result;
    }
}
