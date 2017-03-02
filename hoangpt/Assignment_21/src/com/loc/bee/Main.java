package com.loc.bee;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Bee program!\n1. Create bee list\n2. Attack bees\n3. Exit");
		ArrayList<Bee> beeList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (true) {
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				beeList.clear();
				for (int i = 0; i < 10; i++)
					Queen.createBee(beeList);
				for (int i = 0; i < 10; i++)
					Worker.createBee(beeList);
				for (int i = 0; i < 10; i++)
					Drone.createBee(beeList);
				System.out.println("Type     Health    Dead\n");
				for (Bee bee : beeList)
					bee.display();
				break;
			case 2:
				System.out.println("Type     Health    Dead\n");
				for (Bee bee : beeList) {
					bee.damage();
					bee.display();
				}
				//for (Bee bee : beeList)
				//	bee.display();
				break;
			case 3:
				System.out.println("Bye bye!");
				return;
			}
		}
	}
}
