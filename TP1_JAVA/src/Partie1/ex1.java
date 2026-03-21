package Partie1;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un entier:");
		int N = sc.nextInt();
		
		if(N > 0) {
			System.out.println("Le nombre est positif");
		}
		else if(N<0) {
			System.out.println("Le nombre est négatif");
		}
		else {
			System.out.println("Le nombre est nul");
		}
		
		sc.close();
	}

}
