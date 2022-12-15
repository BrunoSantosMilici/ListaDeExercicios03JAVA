package lista3;

import java.util.Scanner;

public class Lista3_exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor A");
		float a = sc.nextFloat();
		System.out.println("Digite o valor B");
		float b = sc.nextFloat();
		System.out.println("Digite o valor C");
		float c = sc.nextFloat();
		
		float resposta = (float) (Math.pow((a + b + c), 2));
		
		System.out.println("O resultado é: " + resposta);
	}

}
