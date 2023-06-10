package poo;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVect01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 10;

		int[] vect = new int[n];

		System.out.println("Enter the numbers to verificate whats is negative: ");

		for (int i = 0; i < vect.length; i++) {

			vect[i] = sc.nextInt();

		}

		for (int i = 0; i < vect.length; i++) {
			for (int j = 0; j < vect.length - 1; j++) {

				if (vect[j] > vect[j + 1]) {

					int aux = vect[j];
					vect[j] = vect[j + 1];
					vect[j + 1] = aux;
				}
			}
		}

		System.out.println();
		System.out.println("Thats are the negative numbers: : ");

		for (int i = 0; i < vect.length; i++) {

			if (vect[i] < 0)

				System.out.print(vect[i] + ", ");
		}

		sc.close();
	}

}
