package lista3;

import java.util.Scanner;

public class Lista3_exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura da caixa");
		float altura = sc.nextFloat();
		System.out.println("Digite a largura da caixa");
		float largura = sc.nextFloat();
		System.out.println("Digite a comprimento da caixa");
		float comprimento = sc.nextFloat();
		
		float volume = comprimento * altura * largura;
		
		System.out.println("O volume da caixa é de: " + volume );
	}

}
// calculador de volume de caixas