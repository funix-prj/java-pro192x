package com.loc.bee;

import java.util.ArrayList;

public class Drone extends Bee {
	private float health = getHealth();

	public boolean isDead() {
		if (health < 50.0f)
			return true;
		else
			return false;
	}

	public static void createBee(ArrayList<Bee> beeList) {
		Bee drone = new Drone();
		beeList.add(drone);
	}

	public void damage() {
    int r = 0;
		if (isDead() == false)
      r = rd.nextInt(81);
			health -= health * r / 100;
	}

	public void display() {
		if (isDead() == true)
			System.out.println("Drone     " + health + "     Yes");
		else
			System.out.println("Drone     " + health + "     No");
	}
}
