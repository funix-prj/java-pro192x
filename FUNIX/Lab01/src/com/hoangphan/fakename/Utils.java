/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.fakename;

/**
 *
 * @author hoangpt
 */
public class Utils {

  static int size = 3;
  
  public static void printList(String[] datas) {
      System.out.println("Log: --- Print list ---");
      for (int i = 0; i < datas.length; i++) {
        String data = datas[i];
        System.out.println(data);
      }
  }  
  
  
  public static void printListInt(int[] datas) {
      System.out.println("Log: --- Print list ---");
      for (int i = 0; i < datas.length; i++) {
        int data = datas[i];
        System.out.println(data);
      }
  }   
  
}
