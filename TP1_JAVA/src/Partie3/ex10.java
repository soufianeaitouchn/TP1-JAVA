package Partie3;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lines, columns;
		
		System.out.print("Entrez le nombre de lignes : ");
		lines = sc.nextInt();
		System.out.print("Entrez le nombre de colonnes : ");
		columns = sc.nextInt();
		
		int[][] L = new int[lines][columns];
		System.out.println("Entrez les éléments de la matrice : ");
		for(int i=0; i<lines; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print("L [" + i + "][" + j + "] =");
				L[i][j] = sc.nextInt();
			}
		}
		System.out.print("\nMatrice avant transposée :\n");
		for(int i=0; i<lines; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(L[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.print("\nMatrice transposée :\n");
		for(int i=0; i<columns; i++) {
			for(int j=0; j<lines; j++) {
				System.out.print(L[j][i] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
