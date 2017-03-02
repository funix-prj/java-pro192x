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
public class ThuyTinh {
  
  void bringElephant(){
    for (int i = 0; i < 10; i++) {
      taskElephan();
      sing9("Voi");
    }
    
    taskElephan9();
    sing9("Ga");
  }

  //procedure
  //routine
  void taskElephan(){
    //mua voi
    //van chuyen
    //dem den
    System.out.println("Thuy Tinh da xong voi");
  }

  private void taskElephan9() {
    System.out.println("Thuy Tinh da xong voi 9 nga");
  }

  private void sing9(String type) {
    if(type.equals("Voi")){
      System.out.println("Voi voi voi");
    } else {
      System.out.println("o o o");
    }
  }
  
  private void sleep(String type){
    if(type.equals("Elephan") || type.equals("Chicken")){
      System.out.println("kho` kho`");
    } else {
      //trau
      
      //ngua
      
      
      //bo
    
    }
    
  }
}
