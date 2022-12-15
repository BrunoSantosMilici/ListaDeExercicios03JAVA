package lista3;

import java.util.Scanner;

public class Simulador_de_eleição {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("número de eleitores");
		int eleitorado = sc.nextInt();
		System.out.println("número de votos brancos");
		int brancos = sc.nextInt();
		System.out.println("números de votos nulos");
		int nulos = sc.nextInt();
		System.out.println("Número de votos do Candidato A");
		int candidatoA = sc.nextInt();
		System.out.println("Número de votos do Candidato B");
		int candidatoB = sc.nextInt();
		System.out.println("Número de votos do Candidato C");
		int candidatoC = sc.nextInt();
		
		
		float validos = candidatoA + candidatoB + candidatoC;
		float porcentValidos = ((float) validos) /  ((float) eleitorado) * 100;
		float porcentBranco = ((float) brancos) / ((float) eleitorado) * 100;
		float porcentNulos =  ((float) nulos) / ((float) eleitorado) * 100;
		
		float porcentA = ((float) candidatoA) / ((float)validos) * 100;
		float porcentB = ((float) candidatoB) / ((float)validos) * 100;
	    float porcentC = ((float) candidatoC) / ((float)validos) * 100;
		
		System.out.println("Quantidade de votos válidos: " + validos);
	
		
		System.out.println("A eleição teve " + porcentValidos + "% de votos validos");
		System.out.println("A eleição teve " + porcentBranco + "% de votos brancos");
		System.out.println("A eleição teve " + porcentNulos + "% de votos nulos");
			System.out.println("O candidato A teve " + porcentA + "% de votos");		System.out.println("O candidato B teve " + porcentB + "% de votos");		System.out.println("O candidato C teve " + porcentC + "% de votos");	}
}
