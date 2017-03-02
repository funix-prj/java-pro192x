package com.loc.bee;

import java.util.ArrayList;

public class Worker extends Bee {
	private float health = getHealth();

	public boolean isDead() {
		if (health < 70.0f)
			return true;
		else
			return false;
	}

	public static void createBee(ArrayList<Bee> beeList) {
		Bee worker = new Worker();
		beeList.add(worker);
	}

	public void damage() {
		if (isDead() == false)
			health = health - health * (float) (rd.nextInt(81) / 100);
	}

	public void display() {
		if (isDead() == true)
			System.out.println("Worker    " + health + "     Yes");
		else
			System.out.println("Worker    " + health + "     No");
	}
}
