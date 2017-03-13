/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.staffapp.fu.domain;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoangpt
 */
public class TeacherTestDriver {
  
  
  public static void main(String[] args) {
    try {
      Teacher teacher = new Teacher();
      teacher.name = "Hoang";
      teacher.salaryRatio = 1;
      teacher.degree = 0;
      teacher.teaching_time = 10;

      double outputCorrect = 1480;
    
      double output = teacher.calculateSalary();
      
      if(outputCorrect != output){
        System.out.println("Error, should be "+outputCorrect+ " while output is "+output);
      } else {
        System.out.println("OK");
      }
      
    } catch (Exception ex) {
      Logger.getLogger(TeacherTestDriver.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
}
