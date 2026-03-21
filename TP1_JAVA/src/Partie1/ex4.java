package Partie1;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un entier:");
		int N = sc.nextInt();
		
		int sum = 0;
		int i = 0;
		while(i<=N) {
			sum+=i;
			i++;
		}
		System.out.print("La somme des " + N + " premiers entiers est " + sum);
		sc.close();
	}

}
