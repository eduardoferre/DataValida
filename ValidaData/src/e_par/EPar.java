package e_par;

import java.util.Scanner;
public class EPar {
	
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int n1;
		
		System.out.print("Digite um número: ");
		n1 = scanf.nextInt();
		
		if(n1%2==0) {
			System.out.println(true);
		}
		else if(n1%2!=0) {
			System.out.println(false);
		}
		
		
	}

}
