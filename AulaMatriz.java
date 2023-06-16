package poo;

import java.util.Scanner;

public class AulaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 3;

		int[][] mat = new int[n][n];
		System.out.println("Enter the data of a matrix to 3st order:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();

			}
		}
		int count = 0;
		System.out.println("The Main Diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				
				if(mat[i][j]<0)
					count ++;
				if (i == j) {
					System.out.print(mat[i][j] + " ");

				}
			}
		}
		System.out.println();
		System.out.println("The Second Main Diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				
				
				if (i + j==mat.length-1) {
					System.out.print(mat[i][j] + " ");

				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers: " + count);
		sc.close();
	}

}
