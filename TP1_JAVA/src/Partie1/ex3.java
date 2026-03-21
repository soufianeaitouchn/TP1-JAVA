package Partie1;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un entier:");
		int N = sc.nextInt();
		
		System.out.print("Table de multiplication: ");
		for(int i=0; i<=10; i++) {
			System.out.print(N + "x" + i + "=" + N*i + "\n");
		}
		sc.close();
	}

}
