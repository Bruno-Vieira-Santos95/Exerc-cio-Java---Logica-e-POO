package Entrada_saida;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int area;
        int base;
        int altura;

        System.out.println("Informe a base do retangulo: ");
        base = ler.nextInt();

        System.out.printf("\nInforme a altura do retangulo: ");
        altura = ler.nextInt();

        area = base * altura;

        System.out.printf("\nA Area do retangulo: %d cm2.", area);
    }
}
