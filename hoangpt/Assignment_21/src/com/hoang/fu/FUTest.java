package com.hoang.fu;

import java.util.*;

/**
 * @author hoangpt
 */
public class FUTest {
  
  public static void main(String[] args) {
    
    ITeacher huy; //declaration
    huy = new ExtraTeacher("Huy"); //assign, initialization
    
    ITeacher hieu = new Teacher("Hieu"); //polymorphism
    ITeacher hoang = new ExtraTeacher("Hoang");
    ITeacher dung = new Teacher("Dung"); //polymorphism    

    huy = hieu; //assignment
    
    //key --> value
    //T123x -> Hieu
    //T124x -> Hoang
    HashMap<String, ITeacher> teachers = new HashMap<String, ITeacher>();
    teachers.put("T123x", hieu);
    teachers.put("T124x", hoang);
    teachers.put("T125x", dung);
    
    //indexing
    ITeacher timTeacher = teachers.get("T124x");
    ExtraTeacher hehe = (ExtraTeacher) timTeacher;
    System.out.println(hehe.name);
    
    List<Teacher> list = new ArrayList<>();
    
    Collections.sort(list, new Comparator<Teacher>() {
      @Override
      public int compare(Teacher o1, Teacher o2) {
        return 1;
      }
    });
  
  }
}
