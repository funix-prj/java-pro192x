package com.loc.bee;

import java.util.ArrayList;

public class Queen extends Bee {
	private float health = getHealth();

	public boolean isDead() {
		if (health < 20.0f)
			return true;
		else
			return false;
	}

	public static void createBee(ArrayList<Bee> beeList) {
		Bee queen = new Queen();
		beeList.add(queen);
	}

	public void damage() {
		if (isDead() == false)
			health = health - health * (float) (rd.nextInt(81) / 100);
	}

	public void display() {
		if (isDead() == true)
			System.out.println("Queen     " + health + "     Yes");
		else
			System.out.println("Queen     " + health + "     No");
	}
}
