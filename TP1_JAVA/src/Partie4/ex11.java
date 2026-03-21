package Partie4;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez une chaîne : ");
		String text = sc.nextLine();
		
		int length = text.length();
		
		System.out.print("La longueur de la chaîne est " + length);
		sc.close();
	}

}
