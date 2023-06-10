package poo;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVector02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value the elements to calcule: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double sum = 0.0;
		double average = 0.0;
		for( int i = 0; i<vect.length; i++) {
			
			vect[i] = sc.nextDouble();
		
			sum+= vect[i];
			
			average = sum/vect.length;
		}
		
		for (int i = 0; i < vect.length; i++) {
		System.out.print(vect[i] + ", ");	
		}
		System.out.println();
		System.out.println("Average: " + average);
		System.out.println("Sum: " + sum);
		
		sc.close();
	}

}
