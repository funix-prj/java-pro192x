/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.fakename;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hoangpt
 */
public class Menu {
  
  public static void main(String[] args) {
    
    new Menu().show();
  }

  private void show() {
    //Mini1: Show menu
    
    System.out.println("1. FakeName & ID");
    System.out.println("2. Fake Mark");
    System.out.println("3. Calcualte");
    System.out.println("4. Sort");
    System.out.println("5. Find");
    System.out.println("6. Exit");
    
    System.out.print("Please choose 1-6: ");
    
    //if choose 1, fakename & id
    //if choose 2, fake mark
    Scanner scan = new Scanner(System.in); //System.in = keyboard
    int choice = scan.nextInt();
    
    if(choice == 1){
      generateStudent();
    } else if (choice == 2){
      
    } else {
    }
    
    
    //print list
    printName();
    
  }

  String[] firstNames = new String[]{
    "Hoang", "Thuy", "Ha", "Huong", "Binh"
  };

  String[] middleNames = new String[]{
    "Thi", "Van", "Tran", "Hoang", "Huy"
  };

  String[] lastNames = new String[]{
    "Phan", "Tran", "Nguyen", "La", "Nghiem"
  };
  
  int size = 3;
  String fullNames [] = new String[size];
  String xterIDs [] = new String[size];
  
  private void generateStudent() {
    //fake name
    for (int i = 0; i < size; i++) {
      fakeName(i);
    }
        
    //fake ID
  }

  private void printName() {
    System.out.println("--- Print list ---");
    for (int i = 0; i < fullNames.length; i++) {
      String fullName = fullNames[i];
      System.out.println(fullName);
    }
  }

  private void fakeName(int index) {
    Random random = new Random();
    //fake firstname
    int sizeFirstName = firstNames.length; //=5
    int randomFirstName = random.nextInt(sizeFirstName-1);
    
    String firstName = firstNames[randomFirstName];
    //System.out.println(firstName);
    

    //fake middlename
    int sizeMiddleName = middleNames.length; //=5
    int randomMiddleName = random.nextInt(sizeMiddleName-1);
    
    String middleName = middleNames[randomMiddleName];
    //System.out.println(middleName);

    //fake lastname
    int sizeLastName = lastNames.length; //=5
    int randomLastName = random.nextInt(sizeLastName-1);
    
    String lastName = lastNames[randomLastName];   
    //System.out.println(lastName);
    
    String fullName = firstName+" "+middleName+" "+ lastName;
    //System.out.println(fullName);
    
    
    fullNames[index] = fullName;
  }
}
