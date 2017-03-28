/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.fakename;

import java.util.Random;

/**
 *
 * @author hoangpt
 */
public class MockID {
  
 
  String xTerIds [] = new String[Utils.size];  

  void generateId() {
    for (int i = 0; i < Utils.size; i++) {
      String id = makeId();
      xTerIds[i] = id;
    }
  }

  private String makeId() {
    Random ran = new Random();

    String id = "FU";
    
    for (int i = 0; i < 5; i++) {
      int r = ran.nextInt(9);
      id = id + r;
    }
    
    return id;
  }
}
