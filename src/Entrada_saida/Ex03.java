package Entrada_saida;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        // 3. A partir dos valores da base e altura de um tri�ngulo, calcular e exibir sua �rea

        Scanner ler  = new Scanner(System.in);

        int base, altura;
        double area;

        System.out.printf("Informe a base do ret�ngulo: ");
        base = ler.nextInt();

        System.out.printf("\nInforme a altura do ret�ngulo: ");
        altura = ler.nextInt();

        area = (base * altura)/2;

        System.out.printf("\nA �rea do ret�ngulo � %.2f cm�.", area);

    }
}
