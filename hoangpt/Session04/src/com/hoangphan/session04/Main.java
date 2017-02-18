/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.session04;

/**
 *
 * @author hoangpt
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    //build tower
    System.out.println("*");
    System.out.println("**");
    System.out.println("***");
    
    
    buildCarpet();
    buildCarpet();
    
    //hello, new className
    new Greeting().sayHello();
  }
  
  /**
   * behavior
   */
  static void buildCarpet(){
    //build carpet
    System.out.println("---");

    System.out.println("***");
    System.out.println("***");
    System.out.println("***");
    
    
    
  }
}
