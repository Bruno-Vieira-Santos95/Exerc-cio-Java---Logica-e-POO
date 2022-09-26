package Estrutura_decisao;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// 14. Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

		Scanner ler = new Scanner(System.in);
	    
		float a, b,c,d;
		
		System.out.printf("peso: ");
		a=ler.nextFloat();
		    
		System.out.printf("altura: ");
		b=ler.nextFloat();
		    
		c=b*b;
		d=a/c;

		if(d>=24.9)
		{
		   System.out.printf("Voce esta acima do peso, IMC= %.2f",d);
		    
		    }
		else {
		    System.out.printf("Peso ideal! Imc= %.2f",d);
		}
		
	}

}
