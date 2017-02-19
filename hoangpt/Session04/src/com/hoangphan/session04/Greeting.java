/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.session04;

import com.hoangphan.session04.dog.Dog;

/**
 * @author hoangpt
 */
class Greeting {
  
  Dog myDogs [];
  Dog[] yourDogs = new Dog[7];

  /**
   * contructor method
   */
  public Greeting() {
  }

  void sayHello() {
     System.out.println("Hello, how are you.");
  }
  
  void sayHello(String name){
    System.out.println("Hello "+name+" ^^");
  }
  
  //signature
  //access_modifier type name_function(param)
  public String sayGoodbye(String name){
    return "Goodbye "+name+".";
  }
  
  private void sayHello(int langISO){
    //hello in English
    System.out.println("Hello Luong ^^");
    
    //hello in French
    System.out.println("Bonjour Luong ^^");
    
    //hello in VN
    System.out.println("Xin chao Luong ^^");
  }
}
