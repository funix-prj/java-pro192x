/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01;

/**
 *
 * @author hoangpt
 */
public class Session01 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //hello world
    System.out.println("Hello Java");
    System.out.println("My boss is Maria On Java");

    //data (string & number)
    //syntax: type name_variable = "frr"
    String msg = "Hello Java10";
    String msg1 = new String("Hello Java2");
    
    System.out.println(msg);
    System.out.println(msg + " and " + msg1);
    
    //number
    int i = 3; //integer
    long l = 2;
    float f = (float) 3.4; //casting, float
    
    long addNr = i+l;
    System.out.println("Sum of "+i+" and "+l+" :"+addNr);
    
    //logic branching condition: if, 
    if(i == 2){
      System.out.println("i really equal 2");
    } else {
      System.out.println("i really differ 2");
    }
    
    //logic iterate / loop
    for (int j = 0; j < 10; j++) {
      System.out.print(j+" ");
    }
    
  }
}
