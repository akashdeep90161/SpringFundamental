package com.akash;

public class Person {
    private int id;
    private String name;
    private int taxId;
    private Address address;



    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void onCreate()
    {
        System.out.println("Person created" + this);
    }
    public void onDestroye()
    {
        System.out.println("Person destroyed" +this);
    }

    // public Person() {}

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void speak()
    {
        System.out.println("I am a person");
    }


    public static Person getInstance(int id, String name) {
        //This method must be static when be define factory method in bean italef it must be static.

        System.out.println("Creating person using factory method");
        return new Person(id,name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }
}
