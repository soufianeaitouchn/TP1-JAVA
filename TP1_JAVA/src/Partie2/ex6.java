package Partie2;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] T = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.print("Entrez l'élément " + (i+1) + " : ");
			T[i] = sc.nextInt();
		}
		System.out.print("Entrez le nombre à rechercher : ");
		int a = sc.nextInt();
		
		boolean found = false;
		
		for(int i=0; i<10; i++) {
			if(T[i] == a) {
				System.out.print("Nombre trouvé à la position : " + i);
				found = true;
			}
		}
        if (!found) {
            System.out.println("Nombre non trouvé dans le tableau.");
        }

        sc.close();
	}

}
