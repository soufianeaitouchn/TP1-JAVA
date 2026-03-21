package Partie3;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] N = new int[3][3];
		
		System.out.println("Entrez les éléments de la matrice 3x3 :");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("N [" + i + "][" + j + "] =");
				N[i][j] = sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum += N[i][j];
			}
		}
		System.out.print("La somme de tous les éléments de matrice est " + sum );
		sc.close();
	}

}
