/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.staffapp.fu.service;

import com.hoangphan.staffapp.fu.domain.Employee;
import com.hoangphan.staffapp.fu.domain.Officer;
import com.hoangphan.staffapp.fu.domain.Teacher;
import com.hoangphan.staffapp.fu.util.NumberUtil;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoangpt
 */
public class StaffManager {

  ArrayList<Employee> list = new ArrayList<>(); //global, keep state, immutable object

  Teacher inputTeacher() {
    Teacher t = new Teacher();
    
    System.out.print("Name: ");
    t.name = scan.next();
    
    System.out.print("Ratio Salary: ");
    t.salaryRatio = scan.nextInt();
    
    System.out.print("Falcuty: ");
    t.setFalcuty(scan.next());
    
    System.out.print("Degree (0=Bacherlor, 1=Master, 2= Doctor: ");
    t.degree = scan.nextInt();
    
    System.out.print("Working time: ");
    t.setTeaching_time(scan.nextInt());
    
    return t;
  }

  Officer inputOfficer() {
    return null;
  }

  Scanner scan = new Scanner(System.in);

  public ArrayList<Employee> inputData() {
    ArrayList<Employee> list = new ArrayList<>();
    boolean flagCheck = false;
    String choiceStr = null;

    for (int i = 0; i < 2; i++) {
      do {
        System.out.println("1 for Teacher, 2 for Empolyee");
        choiceStr = scan.next();

        //if choice ok -> go to input for each
        //if not => print chon lai di, khong phai so roi
        flagCheck = NumberUtil.checkInteger(choiceStr);
        
        if(!flagCheck){
          System.out.println("Ban sai roi, nhap so chu");
        }
        
      } while (!flagCheck);

      int choice = Integer.parseInt(choiceStr);
      Employee e = null;
      if (choice == 1) {
        e = inputTeacher();
      } else {
        e = inputOfficer();
      }

      list.add(e);
    }

    return list;
  }

  public ArrayList<Employee> sort(ArrayList<Employee> list) {
    //buble sort

    return null;
  }

  public ArrayList<Employee> search(String name) {
    ArrayList<Employee> searchlist = new ArrayList<>();
    
    for (Employee employee : list) {
      if(employee.name.equals(name)){
        searchlist.add(employee);
      }
    }
    
    return searchlist;
  }

  public void printList(ArrayList<Employee> list) {
    for (Employee employee : list) {
      System.out.println(employee.toString());
    }

  }

}
