package poo;

import java.util.Scanner;

import entitites.Rent;

public class Aluguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("How many roons will be rented: ");
		int n = sc.nextInt();
		Rent aux;
		Rent[] rent = new Rent[n];

		for (int i = 0; i < rent.length; i++) {
			System.out.printf("Rent #%d:\n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			// sc.nextLine();
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rent[i] = new Rent(name, email, room);
			System.out.println("\n");

		}

		for (int i = 0; i < rent.length; i++) {
			for (int j = 0; j < rent.length; j++) {

				if (rent[i].getUnit() <= rent[j].getUnit()) {

					aux = rent[i];
					rent[i] = rent[j];
					rent[j] = aux;

				}
			}
		}

		System.out.println("Busy roons:");
		for (int i = 0; i < rent.length; i++) {

			System.out.println(rent[i].toString());

		}

		sc.close();

	}

}
