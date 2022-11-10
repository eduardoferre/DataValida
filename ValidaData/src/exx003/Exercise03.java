package exx003;

import java.util.Scanner;
public class Exercise03 {

	public static void main(String[] args) {
		String operador;
		int n1;
		int n2;
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("Entre com a operação a ser realizada (+, - ou *): ");
		operador = scanf.nextLine();
		System.out.print("Entre com o primeiro número: ");
		n1 = scanf.nextInt();
		System.out.print("Entre com o segundo número: ");
		n2 = scanf.nextInt();
		
		switch(operador) {
		case "+":
			int soma;
			soma = n1 + n2;
			System.out.println("O resultado da operação é: "+soma);
			break;
		case "-":
			int sub;
			sub = n1 - n2;
			System.out.println("O resultado da operação é: "+sub);
			break;
		case "*":
			int mult;
			mult = n1 * n2;
			System.out.println("O resultado da operação é: "+mult);
			break;
		default:
			System.out.println("Operação inválida");
			break;
		}
	}

}
