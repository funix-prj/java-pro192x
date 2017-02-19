/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.session04.dog;

/**
 *
 * @author hoangpt
 */
public class DogTest {
  
  public static void main(String[] args) {
    Dog[] dogs = new Dog[3];
    
    Dog milu = new Dog();
    milu.name = "Milu";
    milu.setAge(1);
    milu.species = "cho phu quoc";
    
    //milu.bark();
    //milu.makeLoveInStreet();
    //milu.eatGoodFood();
    dogs[0] = milu;
    
    //extend, inheritance
    DogFox milo = new DogFox();
    milo.name = "Milo";
    milo.setAge(2);
    milo.species = "cho nhat";
    
    //milo.bark();
    //milo.makeLoveInStreet();
    //milo.eatGoodFood(); //non extend
    dogs[1] = milo;
    
    //polymorphism
    Dog mile = new DogFox();
    mile.name = "Mile";
    mile.setAge(3);
    mile.species = "cho nhat";
    
    //mile.bark();
    //mile.makeLoveInStreet();
    //mile.eatGoodFood();
    dogs[2] = mile;
    
    for (Dog dog : dogs) {
      System.out.println("Dog is "+dog.getAge()+" years old");
      dog.bark();
      dog.makeLoveInStreet();
      //dog.eatGoodFood();
    }
    
    //IDog
    IDog mila = new Dog();
    mila.bark();
    mila.makeLoveInStreet();
  }
}
