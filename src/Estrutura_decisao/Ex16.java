package Estrutura_decisao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// 16. Verificar se três valores quaisquer (A, B, C) que serão digitados formam ou não um triângulo retângulo. Lembre-se que o quadrado da hipotenusa é igual a soma dos quadrados dos catetos.

		Scanner ler = new Scanner(System.in);
		
		float A, B, C;
		
	    System.out.printf("Digite valor do Lado A: ");
	    A=ler.nextInt();
	    
	    System.out.printf("Digite valor do Lado B: ");
	    B=ler.nextInt();
	    
	    System.out.printf("Digite valor do Lado C: ");
	    C=ler.nextInt();
	    
	    
	    if ((A*A) + (B*B) == (C*C)){
	    	
	    	System.out.println("É um Triângulo Retângulo!");
	    	
	    } else {
	    	
	    	System.out.println("Não é um Triânguolo Retângulo!");

	    } 
	}
}
