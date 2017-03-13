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
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    //validation
    //kiem tra neu > 3 thi yeu cau nhap lai
    
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

    for (int i = 0; i < 1; i++) {
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
    //validation
    //code defense
    //error trapping
    if(list != null){
      for (Employee employee : list) {
        System.out.println(employee.toString());
      }
    }
    
    System.out.println("Empty");
  }
  
  public void writeToFile(ArrayList<Employee> list, String filename){
    try {
      ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(filename));
      
      writer.writeObject(list);
    
    } catch (IOException ex) {
      Logger.getLogger(StaffManager.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void saveToFile(ArrayList<Employee> list) {
    try {
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.dat"));
      out.writeObject(list);
    } catch (Exception ex) {
      Logger.getLogger(StaffManager.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public ArrayList<Employee> readFromFile() {
    
    try {
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.dat"));
      
      ArrayList<Employee> list = (ArrayList<Employee>) in.readObject();
      return list;
    
    } catch (Exception ex) {
      //out 1 message
      System.out.println("Bo my` khong thay file");
    }
    
    return null;
  }

  public void writeToText(ArrayList<Employee> list, String txtFile) {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(txtFile));
      
      for (Employee employee : list) {
        if(employee instanceof Teacher){
          Teacher t = (Teacher) employee;
          
          String infoEmployee = t.name+"|"+t.calculateSalary()+"|"+t.getFalcuty();
          writer.write(infoEmployee+"\n");
        }
      }
      
      writer.flush();
    } catch (Exception ex) {
      Logger.getLogger(StaffManager.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      //should close writer
      
    }
  }

  public void readFromText(String file) {
    try {
      BufferedReader in = new BufferedReader(new FileReader(file));
      
      String line = null;
      
      while ((line = in.readLine()) != null){
        String[] info = line.split("\\|");
        
        Teacher s = new Teacher();
        s.name = info[0]; //build/ deserialize
        System.out.println(s.name);
      }
    
    } catch (Exception ex) {
      Logger.getLogger(StaffManager.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
  }
}
