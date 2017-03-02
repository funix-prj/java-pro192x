package com.loc.bee;

import java.util.ArrayList;
import java.util.Random;

public abstract class Bee {
	private float health = 100.0f;
	Random rd = new Random();

	public float getHealth() {
		return health;
	}

	public void setHealth(float health) {
		this.health = health;
	}

	public Bee() {
		super();
	}

	public Bee(float health) {
		super();
		this.health = health;
	}

	public abstract void damage();

	public abstract boolean isDead();

	public static void createBee(ArrayList<Bee> beeList) {
		// Empty static function
	}

	public abstract void display();

  @Override
  public String toString() {
    return "Bee{" + "health=" + health + '}';
  }
}
