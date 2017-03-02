/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoang.fu;

/**
 *
 * @author hoangpt
 */
public class Administrative extends Employee {
  
  @Override //annotation
  float calculateSalary(){
    return 1000f;
  }
  
}
