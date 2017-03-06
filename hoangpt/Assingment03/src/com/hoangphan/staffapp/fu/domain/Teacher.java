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
public class Teacher extends Employee {
  
  private String falcuty;

  public String getFalcuty() {
    return falcuty;
  }

  public void setFalcuty(String falcuty) {
    this.falcuty = falcuty;
  }

  public int getTeaching_time() {
    return teaching_time;
  }

  public void setTeaching_time(int teaching_time) {
    this.teaching_time = teaching_time;
  }
  
  public int degree;//0 = bachelor, 1: master, 2: doctor
  
  public static int DEGREE_BACHELOR = 0;
  public static int DEGREE_MASTER = 1;
  public static int DEGREE_DOCTOR = 2;
  
  int teaching_time;

  @Override
  int getAllowance() {
    if(degree == DEGREE_BACHELOR) {
      return 300;
    } else if(degree == DEGREE_MASTER){
      return 500;
    } else { //validation
      return 1000;
    }
  }

  @Override
  double calculateSalary() {
    return 730*salaryRatio + getAllowance() + teaching_time *45;
  }

  @Override
  public String toString() {
    return "Teacher{" + "name=" + name + ", salary=" + this.calculateSalary();
  }
  
  
}
