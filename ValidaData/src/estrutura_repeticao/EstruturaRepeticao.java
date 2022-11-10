package estrutura_repeticao;

import java.util.Scanner;
public class EstruturaRepeticao {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n1;
		int soma = 0;
		
		do {
			System.out.print("Digite um numero positivo para ser somado ou negativo para sair: ");
			n1 = scanf.nextInt();
			soma += n1;
		}while(n1>0);
		
		System.out.println("A soma é: "+(soma-n1));
	}

}
