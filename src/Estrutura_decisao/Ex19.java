package Estrutura_decisao;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// 19. Uma escola com cursos em regime semestral, realiza duas avaliações durante o semestre e calcula a média do aluno, da seguinte maneira:

		Scanner ler = new Scanner(System.in);

		float p1, p2, media;
		
		System.out.println("Insira a nota da P1: ");
		p1 = ler.nextFloat();
		
		System.out.println("Insira a nota da P2: ");
		p2 = ler.nextFloat();
		
		media = (float) ((p1 + (2*p2))/3);
		
		if (media >= 5) {
			
			System.out.println("Aprovado!");
			
		} else {
			
			System.out.println("Reprovado!");
			
		}
	}
}
