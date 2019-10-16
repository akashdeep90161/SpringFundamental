package com.akash;

public class PersonFactory {
    public Person  createPeraon(int id,String name)
    {
        System.out.println("Creating person using PersonFactory class");
        return new Person(id,name);
    }
    /*
    This method will throw exception because in Factory bean class static method is nod allowed
     public static Person  createPeraon(int id,String name)
    {
        System.out.println("Creating person using PersonFactory class");
        return new Person(id,name);
    }

     */
}
