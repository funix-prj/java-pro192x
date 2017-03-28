/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.fakename;

import java.util.Random;
import java.util.Scanner;

/**
 * Single responsibility
 * @author hoangpt
 */
public class MockName {
  
  //array that contain static data 
  String[] firstNames = new String[]{
    "Hoang", "Thuy", "Ha", "Huong", "Binh"
  };

  String[] middleNames = new String[]{
    "Thi", "Van", "Tran", "Hoang", "Huy"
  };

  String[] lastNames = new String[]{
    "Phan", "Tran", "Nguyen", "La", "Nghiem"
  };
  
  //array that hold data of student: id and name
  String fullNames [] = new String[Utils.size];
  
  void generateStudent() {
    //fake name
    for (int i = 0; i < Utils.size; i++) {
      fakeName(i);
    }
  }

  private void fakeName(int index) {
    //fake firstname
    String firstName = fakeFirstName();

    //fake middlename
    int sizeMiddleName = middleNames.length; //=5
    int randomMiddleName = random.nextInt(sizeMiddleName-1);
    String middleName = middleNames[randomMiddleName];
    System.out.println("Log: " + randomMiddleName+ "|" +middleName);

    //fake lastname
    int sizeLastName = lastNames.length; //=5
    int randomLastName = random.nextInt(sizeLastName-1);
    String lastName = lastNames[randomLastName];   
    System.out.println("Log: " + randomLastName+ "|" + lastName);
    
    String fullName = firstName+" "+middleName+" "+ lastName;
    System.out.println("Log: " + fullName);
    
    //add to array
    fullNames[index] = fullName;
  }  
  
  String fakeFirstName(){
    
    int sizeFirstName = firstNames.length; //=5
    int randomFirstName = random.nextInt(sizeFirstName-1);    
    String firstName = firstNames[randomFirstName];
    System.out.println("Log: "+ randomFirstName+ "|" + firstName);
    
    
    return firstName;
  }
  
  Random random = new Random();

  void search() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Ban muon tim ai: ");
    
    String name = scan.next();
    
    boolean found = false;
    
    for (int i = 0; i < fullNames.length; i++) {
      String fullname = fullNames[i];
      
      if(fullname.contains(name)){
        System.out.println("Found: "+ fullname);
        found = true;
      }
    }
    
    if (!found) {
      System.out.println("Chung toi da co het suc.");
    }
  }
}
