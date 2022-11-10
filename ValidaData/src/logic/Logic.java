package logic;

import java.util.Scanner;
public class Logic {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n1;
		int i = 0;
		int maior = 0;
		
		for(i =0; i<4; i++) {
			System.out.print("Digite um número: ");
			n1 = scanf.nextInt();
			
			if(n1>=maior) {
				maior = n1;
			}
		}
		
		System.out.println("Maior número digitado: "+maior);
	}

}
