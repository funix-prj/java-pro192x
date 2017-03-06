/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.staffapp.fu.domain;

/**
 *
 * @author hoangpt
 */
public class Officer extends Employee {
  
  private String department;
  
  int position;//0 = bachelor, 1: master, 2: doctor
  
  public static int POSITION_STAFF = 0;
  public static int POSITION_VICE = 1;
  public static int POSITION_HEAD = 2;
  
  int working_time;
  

  @Override
  int getAllowance() {
    if(position == POSITION_STAFF) {
      return 500;
    } else if(position == POSITION_VICE){
      return 1000;
    } else {
      return 2000;
    }
  }

  @Override
  double calculateSalary() {
    return salaryRatio*730 + getAllowance() + working_time*30;
  }

  @Override
  public String toString() {
    return "Officer{" + "name=" + name + ", salary=" + calculateSalary();
  }
  
  
  
}
