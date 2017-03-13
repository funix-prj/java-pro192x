/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangphan.staffapp.fu;

import com.hoangphan.staffapp.fu.domain.Teacher;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoangpt
 */
public class TestIO {
  
  public static void main(String[] args) {
  FileOutputStream out = null;
    try {
      //example FileOutputStream
      out = new FileOutputStream("test.txt");
      
      out.write('T');
      out.write('u');
      
      byte[] b = new String("Titi").getBytes();
      out.write(b);
      out.write('\n');
      
      //wrapper
      BufferedOutputStream bOut = new BufferedOutputStream(out);
      bOut.write(b);
      bOut.flush();
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      try {
        out.close();
      } catch (IOException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    try {
      //InputStream: Scanner
      BufferedInputStream in = new BufferedInputStream(new FileInputStream("test2.txt"));
      
      boolean flagEOF = false;
      
      while (!flagEOF) {
        int c = in.read();
        System.out.print((char) c + "|");
        
        if(c == -1){
          flagEOF = true;
        }
      }
      
    } catch (Exception ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    Teacher h = new Teacher();
    h.name = "Hoang";
    h.degree = 1;
    h.salaryRatio = 2;
    
    ObjectOutputStream oOut = null;
    ObjectInputStream oIn = null;
    try {
      oOut = new ObjectOutputStream(new FileOutputStream("teacher.txt"));
      oOut.writeObject(h);
      
      oIn = new ObjectInputStream(new FileInputStream("teacher.txt"));
      Teacher hObject = (Teacher) oIn.readObject();
      
      System.out.println(hObject);
      
    } catch (Exception ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }

    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Your name:");
    String name = null;
    try {
      name = reader.readLine();
    } catch (IOException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    System.out.println("Hello "+name+".");    
  }
  
}
