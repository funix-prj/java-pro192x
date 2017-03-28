/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.tutor01;

/**
 *
 * @author hoangpt
 */
public class Spymen {

  //constructor defautl
  public Spymen() {
  }

  //global
  String fakeName;
  
  void hideName(){
    this.fakeName = "Tam";
  }
  
  void sayHello(String name) {
    //local variable
    System.out.println("Chao ban "+name+". <3");
    this.fakeName = name;
  }
}
