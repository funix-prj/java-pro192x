/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hoangpt
 */
public class Session03 {
  
  public static void main(String[] args) {
    //array, work with collection
    int[] runner = new int[3];
    runner[0] = 1;
    runner[1] = 5;
    runner[2] = 2000;    
  
    //foreach iterate
    for (int runMan : runner) {
      //System.out = monitor
      System.out.println(runMan);
    }
    
    //Random
    int nrMax = 100;
    Random random = new Random();
    int r = random.nextInt(nrMax);
    System.out.println("I guest the nr is "+r);

    //using Scanner
    //System.in = keyboard
    //object use for IO (input/output)
    Scanner scaner = new Scanner(System.in);
    System.out.println("Input number of cows:");
    int nrCow = scaner.nextInt();
    
    System.out.println("You have "+nrCow+" cows");
    
    
    
    
    
  }
  
}
