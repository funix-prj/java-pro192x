/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.oop;

/**
 *
 * @author hoangpt
 */
public class DashAnimal {
  
  private String name;
  private int age;

  //overloading contructor method
  public DashAnimal() {
  }

  public DashAnimal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  //che giau du lieu
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if(age < 0){
      System.out.println("Ngu hon bo. Sao tuoi nho hon 0");
      System.exit(1);
    }
    
    this.age = age;
  }
  
  
  
  
  public void sleep(){
    System.out.println("kho` kho` kho` kho` kho`");
  }
  
  private void haveGirl(){
    System.out.println("Maria On Java");
  }
  
  public void makeLove(){
  
  }
}
