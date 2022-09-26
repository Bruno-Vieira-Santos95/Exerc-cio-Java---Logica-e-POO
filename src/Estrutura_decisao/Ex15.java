package Estrutura_decisao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// 15. A partir de tr�s valores que ser�o digitados, verificar se formam ou n�o um tri�ngulo. Em caso positivo, exibir sua classifica��o: �Is�sceles, escaleno ou eq�il�tero�. Um tri�ngulo escaleno possui todos os lados diferentes, o is�sceles, dois lados 
		//iguais e o eq�il�tero, todos os lados iguais. Para existir tri�ngulo � necess�rio que a soma de dois lados quaisquer seja maior que o outro, isto, para os tr�s lados.

		Scanner ler = new Scanner(System.in);
		
		int A, B, C;
		
	    System.out.printf("Digite valor do lado A: ");
	    A=ler.nextInt();
	    
	    System.out.printf("Digite valor do lado B: ");
	    B=ler.nextInt();
	    
	    System.out.printf("Digite valor do lado C: ");
	    C=ler.nextInt();
	    
	    if (A == B && B == C){
	    	
	    	System.out.println("Tri�ngulo Equil�tero!");
	    	
	    } else if (A==B || A==C || B==C) {
	    	
	    	System.out.println("Tri�ngulo Is�sceles!");

	    } else {
	    	
	    	System.out.println("Tri�ngulo Escaleno!");
	    	
	    }
	}
}
