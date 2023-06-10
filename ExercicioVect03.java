package poo;

import java.util.Locale;
import java.util.Scanner;

import entitites.ExercVect03;

public class ExercicioVect03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter how many students will be cadaster: ");
		int n = sc.nextInt();
		sc.nextLine();
		int account = 0;
		double average;
		double sum = 0;

		ExercVect03[] vect = new ExercVect03[n];
		
		for (int i = 0; i < vect.length; i++) {

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			System.out.print("Height: ");
			double height = sc.nextDouble();
			sc.nextLine();

			vect[i] = new ExercVect03(name, age, height);

			sum += vect[i].getHeight();

			if (vect[i].getAge() < 16) {

				account++;

			}
			System.out.println("---------------");
			
			
		}
		System.out.println("---------------");
		average = sum / vect.length;
		double percentage = (account * 100) / vect.length;

		System.out.printf("Average height: %.2f\n", average);
		System.out.printf("Sub 16 tean percentage %.2f\n", percentage);
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName().toUpperCase());
			}
		}

		sc.close();
	}

}
