package Partie2;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez la taille du tableau:");
		int N = sc.nextInt();
		
		int[] T = new int[N];
		for(int i=0; i<N; i++) {
			System.out.print("Entrez l'élément " + (i+1) + ": ");
			T[i] = sc.nextInt();
		}
		int max = T[0];
		for(int i=1; i<N; i++) {
			if(T[i]>max) {
				max = T[i];
			}
	    }
		System.out.print("Le plus grand élément est " + max);
		sc.close();
     }

}
