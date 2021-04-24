package SmarPhone;

import java.util.Scanner;
public class SmartPhone {

	private double length, width, height, weight;
	private String charger;

		
		Scanner s = new Scanner(System.in);
		//default constructor
	SmartPhone(){
		System.out.print("Please enter the length of smartphone: ");
		this.length = s.nextDouble();
		System.out.print("Please enter the width of smartphone: ");
		this.width = s.nextDouble();
		System.out.print("Please enter the height of smartphone: ");
		this.height = s.nextDouble();
		System.out.print("Please enter the weight of smarphone: ");
		this.weight = s.nextDouble();
		
	
	}
	String charger() {
		System.out.println("Do you want to add on a fast-charging cable? ");
		this.charger = s.next();
		switch (charger) {
			case "yes":
				System.out.println("The fast-charging cable is added.");
				break;
			case "No":
				System.out.println("The original cable is added.");
				break;
		}
		return charger;
	}
	
	double getLength() {
		return this.length;
	}
	
	double getWidth() {
		return this.width;
	}
	
	double getHeight() {
		return this.height;
	}
	
	double getWeight() {
		return this.weight;
	}
}
