/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.staffapp.fu.util;

/**
 *
 * @author hoangpt
 */
public class NumberUtil {
  
  public static boolean checkInteger(String str) {
    try {
      Integer.parseInt(str);
    } catch (Exception exp) {
      return false;
    }

    return true; //fast return
  }  
  
}
