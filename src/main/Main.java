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
		String license_plates;
		Integer hora;
		Integer minuts;
		
		
		
		System.out.println();
	
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Car Model : ");
		model = sc.nextLine();
		System.out.print("Car license plates: ");
		license_plates = sc.nextLine();
		
		System.out.println("time");
		System.out.print("horas: ");
		hora = sc.nextInt();
		System.out.print("minuts: ");
		minuts = sc.nextInt();
		
		Parking parking = new Parking(name, model, license_plates, hora, minuts);
		
		
		System.out.println("---------------------------");
		System.out.println("1h - $10");
		System.out.println("2h - $20");
		System.out.println("3h - $30");
		System.out.println("4h - $40");
		System.out.println("---------------------------\n");
		
		System.out.println("What time is it?");
		
		System.out.println("time");
		System.out.print("horas: ");
		int hora1 = sc.nextInt();
		System.out.print("minuts: ");
		int minuts1 = sc.nextInt();
		
		System.out.println("\n---------------------------\n");
		System.out.println("Payment: $" + parking.calc(hora1, minuts1));
		

	}

}
