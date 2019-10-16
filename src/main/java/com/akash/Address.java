package com.akash;

public class Address {
    private String street;
    private String postCode;

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }

    public void onCreate()
    {
        System.out.println("Address created" + this);
    }
    public void onDestroye()
    {
        System.out.println("Address destroyed" +this);
    }

    public Address(String street, String postCode) {
        this.street = street;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
