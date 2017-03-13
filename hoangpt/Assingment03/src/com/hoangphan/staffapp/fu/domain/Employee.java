/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.staffapp.fu.domain;

import java.io.Serializable;

/**
 * serial killer
 * @author hoangpt
 */
public abstract class Employee implements Serializable {
  
  public String name;
  public int salaryRatio;
  
  abstract public int getAllowance() throws Exception;
  abstract public double calculateSalary() throws Exception;
  
  
}
