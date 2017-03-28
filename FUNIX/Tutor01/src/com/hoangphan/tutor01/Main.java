/*
 * package
 * @author hoangpt
 */
package com.hoangphan.tutor01;

/**
 *
 * @author hoangpt
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //System.out = monitor
    System.out.println("Hello world");
    
    //declair variable
    String name = "Hoang"; //literal
    System.out.println("Hello "+name+" ^^");
    System.out.println(name+", how are you?");
    System.out.println("What wrong with "+name+". Are you ok ?");
    
    //#string => number
    int age = 17; //literal
    double salary = 100.5;
    
    printBorn(name, age);
    printBorn("Huong", 20);
    
    //branching: if, switch
    if (age <= 17){
      System.out.println("Hoang is teenager.");
    }
    
    //looping
    for (int i = 0; i < 5; i++) {
      printHoho();
    }
    
    //collection
    String[] names = new String[2];
    names[0] = name;
    names[1] = "Huong";
    
    for (int i = 0; i < names.length; i++) {
      String nameInArr = names[i];
      System.out.println(nameInArr);
    }
    
    
    //String, Scanner, Random
    Spymen men = new Spymen();
    men.sayHello("Huong");
    men.sayHello(name);
    
    men.hideName();
    System.out.println("Chao ban "+men.fakeName+" @3*%&^");
    
  }

  /**
   * routines
   * @param name
   * @param age 
   */
  private static void printBorn(String name, int age) {
    int year = 2017 - age;
    System.out.println(name+" is born in "+year);
  }

  private static void printHoho() {
    System.out.println("Mot con vit xoe ra 2 cai canh.");
  }
}
