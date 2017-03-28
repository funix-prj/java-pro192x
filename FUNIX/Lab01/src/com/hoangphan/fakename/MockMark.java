/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.fakename;

import java.util.Random;

/**
 *
 * @author hoangpt
 */
public class MockMark {
  
  int nrSubject = 3; //0:Toan, 1: Ly, 2: Hoa
  int[][] marksSubjects = new int[Utils.size][nrSubject];
  double averages[] = new double[Utils.size];
  String gpa[] = new String[Utils.size];
  
  Random ran = new Random();
  
  void fakeMarks(){
    for (int i = 0; i < nrSubject; i++) {
      //1 subject
      int[] marks = new int[Utils.size];
      
      for (int j = 0; j < Utils.size; j++) {
        int m = ran.nextInt(10);
        marks[j] = m;
      }
      
      marksSubjects[i] = marks;
    }
  }
  
  void calculateAvarage(){
  
  }
  
  
}
