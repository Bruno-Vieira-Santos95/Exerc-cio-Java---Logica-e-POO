package Estrutura_decisao;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// Entrar com o peso, o sexo e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

		Scanner ler = new Scanner(System.in);
		
		String sexo;
		
		float altura, peso, imc;
		
		System.out.println("Informe o seu sexo. Homem ou Mulher? ");
		sexo = ler.next();
		
		System.out.println("Informe a sua Altura: ");
		altura = ler.nextFloat();
		
		System.out.println("Informe o seu Peso: ");
		peso = ler.nextFloat();
		
		imc = peso / (altura*altura);
		
		if (sexo == "homem" || sexo == "Homem") {
			if (imc < 20) {
				System.out.println("Abaixo do Peso!");
			} else if (imc >= 20 && imc < 25) {
				System.out.println("Peso Ideal!");
			} else {
				System.out.println("Acima do Peso!");
			}
		} else {
			if (imc < 19) {
				System.out.println("Abaixo do Peso!");
			} else if (imc >= 19 && imc < 24) {
				System.out.println("Peso Ideal!");
			} else {
				System.out.println("Acima do Peso!");
			}
		}
		//if (sexo == "mulher" || sexo == "Mulher") 
	}
}
