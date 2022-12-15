package lista3;

import java.util.Scanner;

public class Lista3_exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor em dólar");
		float dolar = sc.nextFloat();
		System.out.println("Digite a cotação do dólar");
		float cotacao = sc.nextFloat();
		
		float reais = dolar * cotacao;
		
		System.out.println("O valor convertido em reais é de: " + reais + "R$");
	}

}
