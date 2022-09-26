package Estrutura_decisao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// 15. A partir de três valores que serão digitados, verificar se formam ou não um triângulo. Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou eqüilátero”. Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados 
		//iguais e o eqüilátero, todos os lados iguais. Para existir triângulo é necessário que a soma de dois lados quaisquer seja maior que o outro, isto, para os três lados.

		Scanner ler = new Scanner(System.in);
		
		int A, B, C;
		
	    System.out.printf("Digite valor do lado A: ");
	    A=ler.nextInt();
	    
	    System.out.printf("Digite valor do lado B: ");
	    B=ler.nextInt();
	    
	    System.out.printf("Digite valor do lado C: ");
	    C=ler.nextInt();
	    
	    if (A == B && B == C){
	    	
	    	System.out.println("Triângulo Equilátero!");
	    	
	    } else if (A==B || A==C || B==C) {
	    	
	    	System.out.println("Triângulo Isósceles!");

	    } else {
	    	
	    	System.out.println("Triângulo Escaleno!");
	    	
	    }
	}
}
