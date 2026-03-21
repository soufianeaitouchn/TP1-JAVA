package Partie4;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez une chaîne : ");
		String text = sc.nextLine();
		
		String inverse = "";
		
		for(int i = text.length()-1; i>=0; i--) {
			inverse += text.charAt(i);
		}
		System.out.print("Chaîne inversée : " + inverse);
		sc.close();
	}
}
