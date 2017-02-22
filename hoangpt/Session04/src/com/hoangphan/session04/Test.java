/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.session04;

/**
 *
 * @author hoangpt
 */
public class Test {

  public static void main(String[] args) {
//    int[][] myScores;
//
//    java.util.Random r = new java.util.Random();
//    int k = r.nextInt(100);
//    System.out.println("random is " + k);
//
//    String s = new String("Bicycle");
//    int iBegin = 1;
//    char iEnd = 3;
//    System.out.println(s.substring(iBegin, iEnd));

    int[][][] x = new int[3][][];
    int i, j;
    x[0] = new int[4][];
    x[1] = new int[2][];
    x[2] = new int[5][];
    for (i = 0; i < x.length; i++) {
      for (j = 0; j < x[i].length; j++) {
        x[i][j] = new int[i + j + 1];
        System.out.println("size = " + x[i][j].length);
      }
    }
  }

}
