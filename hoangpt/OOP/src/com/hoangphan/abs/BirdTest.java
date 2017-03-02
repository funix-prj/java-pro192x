/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.abs;

/**
 *
 * @author hoangpt
 */
public class BirdTest {
  public static void main(String[] args) {
    
    new Pigeon().fly();
    new YellowCookoo().fly(); 
    
    Canhcut cc = new Canhcut();
    cc.riaLong();
    cc.fly();
    
    
    Flyable pigeon = new Pigeon();
    Flyable drone = new Drone();
    
    Bird pig2 = new Pigeon();
    Pigeon pig3 = new Pigeon();
  }
}
