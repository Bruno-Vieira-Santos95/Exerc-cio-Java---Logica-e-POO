package Estrutura_decisao;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		//Uma escola com cursos em regime semestral realiza duas avalia��es durante o semestre e calcula a m�dia do aluno, da seguinte maneira:
		//MEDIA = (P1 + 2.P2) / 3
		//Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e o programa dever� calcular e exibir quanto
		//o aluno precisa tirar na segunda nota minimamente (P2) para ser aprovado, sabendo que a m�dia de aprova��o � igual a cinco.

		double P1, P2;

		System.out.printf("Digite o valor da p1: ");
		P1 = ler.nextDouble();
		P2 = (15-P1)/2;
		System.out.printf("O aluno precisar� tirar: %.2f, para ser aprovado", P2);
	}

}
