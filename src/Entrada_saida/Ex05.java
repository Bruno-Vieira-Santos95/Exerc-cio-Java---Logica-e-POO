package Entrada_saida;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        // 5. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.

        Scanner ler = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.printf("Informe a temperatura em graus °C: ");
        celsius = ler.nextDouble();

        fahrenheit = celsius * 1.8 + 32;

        System.out.printf("A temperatura em Fahrenheit é %.2f F. ", fahrenheit);
    }
}
