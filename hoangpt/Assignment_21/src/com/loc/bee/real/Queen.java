/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loc.bee.real;

/**
 *
 * @author hoangpt
 */
public class Queen extends Bee {

  public Queen(int health) {
    this.setHealth(health);
  }
  
  /**
   * camelCase
   * @return 
   */
  
  public boolean isIsDeath() {
    if(this.getHealth() < 20){
      return true;
    }
    
    return false;
  } 
  
  @Override
  public String toString() {
    return "Queen|"+getHealth()+"|"+isIsDeath();
  }  
  
}
