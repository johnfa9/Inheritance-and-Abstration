package com.company;

public class Person implements Biped,Sapient,Sentient{
    public void think(){
        System.out.println("think");
    }
    public void feel(){
        System.out.println(("feel"));
    }
    public void walk(){
        System.out.println(("walk"));
    }

    public static void main(String[] args) {
        Person person=new Person();
        Sapient sapient=person;  //polymorphism
        Sentient sentient=person;  //polymorphism , can only access feel
        Biped biped=person; //can only access walk
        sapient.think();  //can access because overridden

    }
}
