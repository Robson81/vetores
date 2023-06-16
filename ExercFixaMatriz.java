package poo;

import java.util.Scanner;

public class ExercFixaMatriz {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of line to the Matrix: ");
		int n = sc.nextInt();
		System.out.print("Enter the number of columm to the Matrix: ");
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("Enter the number to find your successor, predecessor, superior and inferior");
		int x = sc.nextInt();
		System.out.println("\n");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (x == mat[i][j]) {
					System.out.println("Position: " + i + ", " + j);
					if(j>0) {
				System.out.println("Left: " + mat[i][j-1]);
					}else {}
					if(j<mat[i].length-1) {
				System.out.println("Right: " + mat[i][j+1]);
					}else {}
					if(i>0) {
				System.out.println("Up: " + mat[i-1][j]);
				
					}else {}
					if(i<mat.length-1) {
					System.out.println("Down: " + mat[i+1][j]);
					}else {}
				System.out.println();
				}
			}
		}

		sc.close();
		;
	}

}
