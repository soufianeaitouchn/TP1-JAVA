package Partie2;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez la taille du tableau:");
		int N = sc.nextInt();
		
		int[] T = new int[N];
		
		for (int i=0; i<N; i++) {
			System.out.print("Entrez l'élément " + (i+1) + ": ");
			T[i] = sc.nextInt();
		}
		System.out.println("Les éléments du tableau sont :");
		for(int i = 0; i < N; i++) {
		    if(i < N - 1)
		        System.out.print(T[i] + ", ");
		    else
		        System.out.print(T[i]);
		}
		sc.close();
	}

}
