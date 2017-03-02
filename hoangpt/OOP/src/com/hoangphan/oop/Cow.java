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
public class Cow extends DashAnimal {
  
  @Override
  public void sleep(){
    System.out.println("hiu hiu");
  }
  
  //overload
  public int sleep(int hour){
    System.out.println("hiu hiu 1");
    return 1;
  }
  
  public int sleep(float hour){
    System.out.println("hiu hiu 2");
    return 2;
  }
  
  public int add(int i1, int i2){
    return i1+i2;
  }
  
  public double add(double i1, double i2){
    return i1+i2;
  }  
  
}
