package lista3;

import java.util.Scanner;

public class Lista3_exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor A");
		float a = sc.nextFloat();
		System.out.println("Digite o valor B");
		float b = sc.nextFloat();
		System.out.println("Digite o valor C");
		float c = sc.nextFloat();
		
		float resposta = (float) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
		
		System.out.println("O resultado �: " + resposta);
	}

}
//programa que efetue a leitura de tr�s valores (A, B e C) e apresente como resultado final � soma dos quadrados dos tr�s valores lidos