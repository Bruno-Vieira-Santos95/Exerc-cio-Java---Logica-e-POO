package Entrada_saida;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        //4. Calcular e exibir a m�dia aritm�tica de quatro valores quaisquer que ser�o digitados

        Scanner ler = new Scanner(System.in);

        double media;
        int num1, num2, num3, num4;

        System.out.printf("Digite o primeiro número: ");
        num1 = ler.nextInt();

        System.out.printf("\nDigite o segundo número: ");
        num2 = ler.nextInt();

        System.out.printf("\nDigite o terceiro número: ");
        num3 = ler.nextInt();

        System.out.printf("\nDigite o quarto número: ");
        num4 = ler.nextInt();

        media = (num1 + num2 + num3 + num4) / 4;

        System.out.printf("\nA média dos números informado é %.2f", media);

    }
}
