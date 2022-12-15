package lista3;

import java.util.Scanner;

public class Lista3_exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor em reais");
		float reais = sc.nextFloat();
		System.out.println("Digite a cotação do dólar");
		float cotacao = sc.nextFloat();
		
		float dolar = reais / cotacao;
		
		System.out.println("O valor convertido em dólares é de: " + dolar + "USD");
	}

}
