/*
 * Namespace
 */
package com.loc.bee.real;

import java.util.Random;

/**
 *
 * @author hoangpt
 */
public abstract class Bee {
  int type_id = 1; //worker
  //table
  //id
  //type
  //health
  
  //Gateway Money -> draw, deposit
  //factory
  Random random = new Random();
  
  /**
   * Bean class
   */
  private float health;
  private boolean isDeath; //flag

  public Bee() {
  }

  public Bee(float health) {
    this.health = health;
    this.isDeath = isIsDeath();
  }

  public float getHealth() {
    return health;
  }

  public void setHealth(float health) {
    this.health = health;
  }

  abstract public boolean isIsDeath();

  public void damage(){
    //only affected when bee alive
    int r = random.nextInt(81); //from 0->80;
    float delta = this.health*r/100;
    if(!isIsDeath()){
      this.health -= delta;
    }
  }

  @Override
  abstract public String toString();
}
