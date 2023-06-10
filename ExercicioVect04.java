package poo;

import java.util.Scanner;

public class ExercicioVect04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter how many values wish to analisy: ");
		int n = sc.nextInt();
		int account = 0;
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {

			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				account++;

			}
			System.out.println("-----------");
		}
		System.out.println("-----------");

		for (int i = 0; i < vect.length; i++) {
			for (int j = 0; j < vect.length - 1; j++) {
				if (vect[j] > vect[j + 1]) {
					int aux = vect[j];
					vect[j] = vect[j + 1];
					vect[j + 1] = aux;
				}
			}
		}

		System.out.println("Even numbers: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + ", ");

			}
		}
		System.out.print("\nEven quantity: " + account);

		sc.close();
	}

}
