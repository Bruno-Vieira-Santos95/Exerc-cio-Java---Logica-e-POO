package Estrutura_decisao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// 16. Verificar se tr�s valores quaisquer (A, B, C) que ser�o digitados formam ou n�o um tri�ngulo ret�ngulo. Lembre-se que o quadrado da hipotenusa � igual a soma dos quadrados dos catetos.

		Scanner ler = new Scanner(System.in);
		
		float A, B, C;
		
	    System.out.printf("Digite valor do Lado A: ");
	    A=ler.nextInt();
	    
	    System.out.printf("Digite valor do Lado B: ");
	    B=ler.nextInt();
	    
	    System.out.printf("Digite valor do Lado C: ");
	    C=ler.nextInt();
	    
	    
	    if ((A*A) + (B*B) == (C*C)){
	    	
	    	System.out.println("� um Tri�ngulo Ret�ngulo!");
	    	
	    } else {
	    	
	    	System.out.println("N�o � um Tri�nguolo Ret�ngulo!");

	    } 
	}
}
