/*
 * app FakeName
 * @author hoangpt
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
    System.out.println("1. Fake Name");
    System.out.println("2. Fake ID");
    System.out.println("3. Fake Birthdy");
    System.out.println("4. Fake Mark");
    System.out.println("5. Calcualte");
    System.out.println("6. Sort");
    System.out.println("7. Find");
    System.out.println("8. Exit");
    
    System.out.print("Please choose 1-6: ");
    
    //if choose 1, fakename & id
    //if choose 2, fake mark
    Scanner scan = new Scanner(System.in); //System.in = keyboard
    int choice = scan.nextInt();
    
    MockName mockName = new MockName();
    MockID mockId = new MockID();
    MockMark mockMark = new MockMark();
    
    
    if(choice == 1){
      //Mini2
      mockName.generateStudent();
      mockId.generateId();
      
      mockName.search();
      
    } else if (choice == 2){
      mockMark.fakeMarks();
      
    } else {
    }
    
    
    //print list, only check
    //static]
    for (int i = 0; i < 3; i++) {
      Utils.printListInt(mockMark.marksSubjects[i]);
    }
    
  }


}
