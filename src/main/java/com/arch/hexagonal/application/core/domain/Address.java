package com.arch.hexagonal.application.core.domain;

public class Address {
    private String street;
    private String city;
    private String uf;

    public Address() {

    }

    public Address(String street, String city, String uf) {
        this.street = street;
        this.city = city;
        this.uf = uf;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
