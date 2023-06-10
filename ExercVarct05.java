package poo;

import java.util.Scanner;

public class ExercVarct05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	int n= 6;
	int maior = -1000;
	int position = 0;
	int[] vect = new int[n];
	
	for (int i = 0; i < vect.length; i++) {
		
		vect[i] = sc.nextInt();
		
		if(vect[i]>maior) {
			maior = vect[i];
			position = i;
		}
	}
	System.out.println(maior);
	System.out.println(position);
	
	sc.close();
	}

}
