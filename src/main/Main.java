package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import parking.Parking;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------- HELLO ---------");
		System.out.println(" WELCOME THE CAR PARKING ");
		
		String name;
		String model;
		Integer license_plates;
		Integer hora;
		Integer minuts;
		
		System.out.println();
		hora = sc.nextInt();
		
		minuts = sc.nextInt();
		
//		System.out.printf("time: " + (hora = sc.nextInt()) + ":" + (minuts = sc.nextInt()) );
		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Car Model : ");
		model = sc.nextLine();
		System.out.print("Car license plates: ");
		license_plates = sc.nextInt();
		
		Parking parking = new Parking(name, model, license_plates);
		
		
		
		

	}

}
