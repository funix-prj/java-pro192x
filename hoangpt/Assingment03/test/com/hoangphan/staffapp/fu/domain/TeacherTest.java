/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.staffapp.fu.domain;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hoangpt
 */
public class TeacherTest {

  Teacher teacher;

  @Before
  public void setUp() {
    teacher = new Teacher();

    teacher.name = "Hoang";
    teacher.salaryRatio = 1;
    teacher.degree = 0;
    teacher.teaching_time = 10;

  }

  @After
  public void tearDown() {
    //destructor
    System.out.println("Destroy teacher");
  }

  /**
   * TDD Test of getFalcuty method, of class Teacher.
   */
  @Test
  public void testcalculateSalaryOK() {

    double expResult = 1480; //tester require
    double result = 0;
    try {
      result = teacher.calculateSalary();
    } catch (Exception ex) {
      Logger.getLogger(TeacherTest.class.getName()).log(Level.SEVERE, null, ex);
    }

    assertEquals(expResult, result, 0.01);
  }

  @Test
  public void testcalculateSalaryNotOK() {
    teacher.salaryRatio = -1;
    
    double expResult = 0; //tester require
    double result = 0;
    try {
      result = teacher.calculateSalary();
    } catch (Exception ex) {
      Logger.getLogger(TeacherTest.class.getName()).log(Level.SEVERE, null, ex);
    }

    assertEquals(expResult, result, 0.01);
  }
  
  
  /**
   * Automation test
   */
  @Test
  public void testHoho() {

    String expResult = teacher.hoho();

    //fail("Hoho la cai me gi");
    assertEquals(expResult, teacher.name);
  }

  @Test
  public void testLoginSuccess() {
    //username and password match
    fail("Hehe");
  }

  @Test
  public void testLoginFailDuetoEmptyInput() {
    //username or password empty
    //check popup
    fail("Hehe");
  }

  @Test
  public void testLoginFailDuetoNotMatch() {
    //username and password
    //check popup
    fail("Hehe");
  }

  @Test
  public void testLoginFailDuetoShitWord() {
    //username @#@$alert("Hehe")
    //check popup
    fail("Hehe");
  }

  @Test
  public void testLoginFailDuetoUserNameSmallerThan6() {
    //username @#@$alert("Hehe")
    //check popup
    fail("Hehe");
  }

  @Test
  public void testLoginFailDuetoPasswordNotContainSpecialLetter() {
    //password @#@$alert("Hehe")
    //check popup
    fail("Hehe");
  }

}
