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
public class Worker extends Bee {
  
  public Worker(int health) {
    this.setHealth(health);
  }
  
  public boolean isIsDeath() {
    if(this.getHealth() < 70){
      return true;
    }
    
    return false;
  }   
  
  @Override
  public String toString() {
    return "Worker|"+getHealth()+"|"+isIsDeath();
  }
}
