package com.company.Task1;

public class Address {
    private String address;

    @Override
    public String toString() {
        return "'" + address + '\'';
    }

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean validAddress() {
        if (address == null & !address.matches("/^[a-zA-Z0-9,\\.\\s]+$/") ){
            return false;
        } else {return true;}
    }
}
