package Entrada_saida;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        // 2. Calcular e exibir a �rea de um quadrado, a partir do valor de sua aresta que ser� digitado.

        Scanner ler  = new Scanner(System.in);

        int area, aresta;

        System.out.printf("Digite do valor da aresta: ");
        aresta = ler.nextInt();

        area = aresta * aresta;

        System.out.printf("\nA �rea do quadrado � %d cm�.", area);

    }

}
