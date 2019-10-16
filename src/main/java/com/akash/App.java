package com.akash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App {
    public static void main(String[] args)
    {

        //ApplicationContext context= new FileSystemXmlApplicationContext("beans.xml");
        ApplicationContext context= new FileSystemXmlApplicationContext("src/main/java/beans/beans.xml");
        // ApplicationContext context= new ClassPathXmlApplicationContext("beans/beans.xml");
        Person person1=(Person) context.getBean("person");
      //  Person person2=(Person) context.getBean("person");
     //   person1.setTaxId(999);
        //com.akash.Person person=new com.akash.Person();
        //   person.speak();
       // System.out.println(person2); // Checking for been scope.

        Address address=(Address) context.getBean("address2");
        System.out.println(address);

        FruitBasket fruitBasket=(FruitBasket) context.getBean("basket");
        System.out.println(fruitBasket);

        Jungle jungle =(Jungle) context.getBean("jungle");
        System.out.println(jungle);

        ((FileSystemXmlApplicationContext) context).close();

    }
}
