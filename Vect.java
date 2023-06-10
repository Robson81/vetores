package poo;

import java.util.Locale;
import java.util.Scanner;

import entitites.ProductVect;

public class Vect {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double sum = 0;
		double avarege;
		ProductVect[] vect = new ProductVect[n];
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			vect[i] = new ProductVect(name, price);
			
			sum +=vect[i].getPrice();
			System.out.println();
		}
			avarege = sum/vect.length;
			System.out.printf("The averege price: %.2f",avarege);	
			System.out.println("\n");
	

		sc.close();
	}

}
