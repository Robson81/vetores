package poo;

import java.util.Scanner;

import entitites.ProdPensionato;

public class Pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);


		System.out.print("How many roons wish to rent? ");

		int n = sc.nextInt();

		ProdPensionato[] vect = new ProdPensionato[10];
		System.out.println("Enter the renter data: ");
		for (int i = 0; i < n; i++) {

			System.out.println("Rent #" + (i + 1) + ":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			//vect[room] = new ProdPensionato(name, email);
			vect[i] = new ProdPensionato(name, email, room);
			System.out.println("-------------");
		}
		System.out.println();
		System.out.println("Busy Roons:");
		for (int i = 0; i < n; i++) {
			System.out.println(vect[i]);
		}
		sc.close();
	}

}
