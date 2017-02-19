/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.session04;

import java.util.Random;

/**
 *
 * @author hoangpt
 */
public class Faker {
  
  //use between function
  //state
  Random random = new Random(); //class

  String[] firstNames = {
    "Lan", "Hoang", "Hoa", "Tuan", "Thinh", "Hien"
  };
  
  String[] middleNames = {
    "Thi", "Van", "Huy", "Quoc", "Manh"
  };  
  
  String[] lastNames = {
    "Phan", "Tran", "Nguyen", "Pham", "Do"
  };  

  //behavior
  String mockFirstName() {
    //random, 0, 1, ->4
    int length = firstNames.length;
    int r = random.nextInt(length); //integer
    
    //base on random, get firstName
    String randomFirstName = firstNames[r];
    return randomFirstName;
  }
  
  String mockMiddleName() {
    //random, 0, 1, ->4
    int r = random.nextInt(middleNames.length); //integer
    
    //base on random, get firstName
    return middleNames[r];
  }
  
  String mockLastName() {
    //random, 0, 1, ->4
    int r = random.nextInt(lastNames.length); //integer
    
    //base on random, get firstName
    return lastNames[r];
  }
  
  String mockFullName(){
    return mockFirstName()+" "+mockMiddleName()+" "+mockLastName();
  }
  
  //size = 200
  String[] mockFullNames(int size){
    String[] arrFullName = new String[size];
    
    for (int i = 0; i < size; i++) {
      String fullname = mockFullName(); //creat rendom name
      arrFullName[i] = fullname;
      
      System.out.println(fullname);
    }
    
    return arrFullName;
  }
}
