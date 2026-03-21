package Partie1;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entez le premier nombre:");
		int x = sc.nextInt();
		
		System.out.print("Entez le deuxième nombre:");
		int y = sc.nextInt();
		
		System.out.print("Entez le troisième nombre:");
		int z = sc.nextInt();
		
		int max = x;
		
		if(y>max) {
			max = y;
		}
		if(z>max) {
			max = z;
		}
		
		System.out.println("Le plus grand nombre est " + max);
		sc.close();
	}

}
