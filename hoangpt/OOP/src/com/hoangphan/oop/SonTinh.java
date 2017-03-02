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
public class SonTinh {
  
  void bringElephant(){
    for (int i = 0; i < 10; i++) {
      new Elephan().taskElephan();
    }
    
    Chicken chicken = new Chicken();
    chicken.sleep();
    
    Elephan elephan = new Elephan();
    elephan.sleep();
    
    //poly = bach
    //morphism
    DashAnimal chicken2 = new Chicken(); //casting
    DashAnimal chicken3 = (DashAnimal) chicken;
    Elephan elephan1 = new Elephan();
    
    DashAnimal[] list = new DashAnimal[3];
    list[0]= chicken2;
    list[1]= chicken3;
    list[2]= elephan1;
    
    for (int i = 0; i < list.length; i++) {
      list[i].sleep();
    }
    
    elephan1.dance9();
    
    Cow cow = new Cow();
    cow.sleep();
    cow.sleep(2);
    
    //capsule
    cow.setName("Bo hoang");
    cow.setAge(-1);
  }
}
