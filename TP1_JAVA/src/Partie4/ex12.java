package Partie4;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez une chaîne : ");
		String text = sc.nextLine();
		
		int counter = 0;
		
		for(int i=0; i<text.length(); i++) {
			char c = text.charAt(i);
			if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'y' || c == 'Y' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
				counter++;
			}
		}
		System.out.print("Le nombre de voyelles est " + counter);
		sc.close();
	}

}
