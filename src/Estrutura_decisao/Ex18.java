package Estrutura_decisao;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// 18. Criar um programa para analisar a velocidade de um automóvel. Solicitar via teclado os valores da aceleração (a em m/s2), velocidade inicial (v0 em m/s) e o tempo de percurso (t em s). Calcular e exibir a velocidade final do automóvel em km/h. E exibir mensagem de acordo com a tabela abaixo:

		Scanner ler = new Scanner(System.in);
		
		float A, V0, T, V, Km;
		
		System.out.println("Informe a sua Aceleração: ");
		A = ler.nextFloat();
		
		System.out.println("Informe a sua Velocidade Inicial em m/s: ");
		V0 = ler.nextFloat();
		
		System.out.println("Informe o seu tempo de percurso em segundos: ");
		T = ler.nextFloat();
		
		V = V0 + A * T;
		Km = (float) (V * 3.6);
		
		System.out.printf("A velocidade do veículo é %.2f km/h.\n", Km);
		
		if (V <= 40) {
			System.out.println("Veículo muito lento.");
		} else if (V > 40 && V <= 60) {
			System.out.println("Velocidade permitida.");
		} else if (V > 60 && V <= 80) {
			System.out.println("Velocidade de Cruzeiro.");
		} else if (V > 80 && V <= 120) {
			System.out.println("Veículo Rápido.");
		} else {
			System.out.println("Veículo muito rápido.");
		}
	}
}
