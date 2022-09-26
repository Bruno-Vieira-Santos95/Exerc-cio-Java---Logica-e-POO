package Entrada_saida;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        // 6. Entrar via teclado com o valor da cota��o do d�lar e uma certa quantidade de d�lares. Calcular e exibir o valor correspondente em Reais (R$).

        Scanner ler = new Scanner(System.in);

        double cotacao, dolar, real;

        System.out.printf("Informa��o a cota��o do d�lar: ");
        cotacao = ler.nextDouble();

        System.out.printf("\nInforme a quantidade de valores em D�lar: ");
        dolar = ler.nextDouble();

        real = cotacao * dolar;

        System.out.printf("\nO valor dos d�lares em reais � R$ %.2f ", real);

    }
}
