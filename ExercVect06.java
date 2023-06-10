package poo;

import java.util.Scanner;

public class ExercVect06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
	int[] vect = new int[6];
	int[] vect2 = new int[6];

	System.out.println("Enter the values of 1St vector:");
	for (int i = 0; i < vect.length; i++) {
		
		vect[i] = sc.nextInt();
	
	}
	System.out.println("\n");
	System.out.println("Enter the values of 2St vector:");
	for (int i = 0; i < vect.length; i++) {
		vect2[i] = sc.nextInt();
	}
	System.out.println("\n");
	System.out.println("The sum of the values of Vector1 and Vectyor2 is:");
	
	for (int i = 0; i < vect.length; i++) {
		
		System.out.println(vect[i]+vect2[i]);
	}
	
	sc.close();
	}

}
