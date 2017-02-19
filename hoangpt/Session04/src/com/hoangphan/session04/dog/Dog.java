/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.session04.dog;

/**
 * Entity Dog
 * 
 * @author hoangpt
 */
public class Dog implements IDog {
  
  String name = "Cho";
  private int age = 1;
  String species = "Becgie";
  
  //encasulation -> javabean
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age+10;
  }

  public void setAge(int age) {
    if (age < 1){
      System.out.println("DM, may cung ngu nhu cho.");
      System.exit(0);
    }
    
    this.age = age;
  }
  
  public void bark(){
    System.out.println("Gau gau "+name+"!");
  }
  
  public void makeLoveInStreet(){
    for (int i = 0; i < age; i++) {
      System.out.println(species+" day, suong qua.");
    }
  }
  
}
