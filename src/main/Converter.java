package main;

//import java.util.Arrays;
import java.util.Scanner;

public class Converter {
//	Scanner
	static Scanner scanner = new Scanner(System.in);
//	Switch variables
	static int userRaw = 0;
	static double userConvert = 0;
//	Instance
	static Converter converter = new Converter();
	
	public static void main(String[] args) {
//		Setup
		int menuSelection = -1;
//		Menu
		String[] items = Converter.menu();

		//		Main program loop
		while (menuSelection != items.length) {
//			Print menu
			System.out.println("Please select an option:");
			for (int i = 0; i < items.length; i++) {
				System.out.println(items[i]);
			}
			
//			Int choice validation
			while (true) {
				menuSelection = scanner.nextInt();
				if (menuSelection >= 1 & menuSelection <= 5) {
					break;
				}
				System.out.println("Please enter 1-5");
			}	
			

			
//			Options to run
			switch(menuSelection) {		
			case 1:
				converter.lbKg();
				break;
				
			case 2:
				converter.fC();
				break;
				
			case 3:
				converter.miKm();
				break;
				
			case 4:
				converter.ozMl();
				break;				
			}
			
		}
//			Close scanner, quit
			scanner.close();
			System.out.println("Quitting");
			
		}
	
//	Method to set menu
	public static String[] menu(){
		String[] items = {"1. Pounds to Kilograms", "2. Fahrenheit to Celsius", "3. Miles to Kilometers", "4. Ounces to Mililiters", "5. Exit"};
		return items;
	}
	
//	lb to kg conversion method
	public void lbKg() {
		System.out.println("Pounds to Kilograms-\n" + "Input pounds to convert:");
		userRaw = scanner.nextInt();
		userConvert = userRaw / 2.2046;
		System.out.println(userRaw + " lbs. is " + userConvert + " kg");
	}
	 
//	F to C conversion method
	public void fC() {
		System.out.println("Fahrenheit to Celsius -\n" + "Input degree(F) to convert:");
		userRaw = scanner.nextInt();
		userConvert = ((userRaw -32) * 5) / 9;
		System.out.println(userRaw + "F is " + userConvert + "C");	
	}
	
//	mile to km conversion method
	public void miKm() {
		System.out.println("Miles to Kilometers-\n" + "Input miles to convert:");
		userRaw = scanner.nextInt();
		userConvert = userRaw *1.609344;
		System.out.println(userRaw + " miles is " + userConvert + " km");	
	}
	
//	oz to ml conversion method
	public void ozMl() {
		System.out.println("Ounces to Mililiters-\n" + "Input ounces to convert:");
		userRaw = scanner.nextInt();
		userConvert = userRaw * 29.57352956;
		System.out.println(userRaw + " oz is " + userConvert + " ml");	
	}
	
}
