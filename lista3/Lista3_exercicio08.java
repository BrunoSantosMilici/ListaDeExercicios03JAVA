package lista3;

import java.util.Scanner;

public class Lista3_exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor A");
		float a = sc.nextFloat();
		System.out.println("Digite o valor B");
		float b = sc.nextFloat();
		System.out.println("Digite o valor C");
		float c = sc.nextFloat();
		System.out.println("Digite o valor D");
		float d = sc.nextFloat();
		
		float soma = b + d;
		float produto = a / c;
		
		System.out.println("O produto de A e C é: " + produto);
		System.out.println("A soma de B e D é: " + soma);
	}

}
