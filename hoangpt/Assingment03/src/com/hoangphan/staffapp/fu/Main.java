/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.staffapp.fu;

import com.hoangphan.staffapp.fu.domain.Employee;
import com.hoangphan.staffapp.fu.domain.Teacher;
import com.hoangphan.staffapp.fu.service.StaffManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * MVC
 * @author hoangpt
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    new Main().runApp();
  }

  void printMenu() {
    System.out.println("0- Show list");
    System.out.println("1- Input data");
    System.out.println("2- Sorting list");
    System.out.println("3- Search by name");
    System.out.println("4- Exit");

    System.out.print("Select 0,1,2,3,4: "); //ba  
  }  
  
  private void runApp() {
    //1 - create bee 
    StaffManager manager = new StaffManager();
    ArrayList<Employee> list = null;
    int choice = 0;
    
    list = manager.readFromFile();
    //manager.writeToText(list, "employee.txt");
    manager.readFromText("employee.txt");
    

    //print menu
    //1st try printmenu
    //2nd -> menu again
    do {
      printMenu();
      Scanner scanner = new Scanner(System.in);
      choice = scanner.nextInt(); //not catch input word

      switch (choice) {
        case 0:
          manager.printList(list);
          break;
        case 1:
          list = manager.inputData();
          manager.printList(list);
          break;
        case 2:
          ArrayList<Employee> sortedList = manager.sort(list);
          manager.printList(list);
          break;
        case 3:
          ArrayList<Employee> searchedList = manager.search("Hoang");
          if(searchedList == null){
            System.out.println("Khong thay gi ca");
          }
          
          manager.printList(searchedList);
          
          break;
          
        case 4:
          //save to file
          manager.saveToFile(list);
          
          
          System.exit(0);
          break;

        default:
          System.out.println("Ngu the. Tao chua kip lam so > 4");
          //in menu
          break;
      }
    } while (choice != 4);
  }
}
