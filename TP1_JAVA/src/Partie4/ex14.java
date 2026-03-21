package Partie4;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez une chaîne : ");
		String text = sc.nextLine().toLowerCase();
		
		String inverse = new StringBuilder(text).reverse().toString();
		
		if(text.equals(inverse)){
			System.out.print("Chaîne est un palindrome.");
		}
		else {
			System.out.print("Chaîne n'est pas un palindrome.");
		}
		sc.close();
	}
}
