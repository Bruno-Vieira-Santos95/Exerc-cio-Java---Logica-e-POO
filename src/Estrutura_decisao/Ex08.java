package Estrutura_decisao;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        // 8. Entrar via teclado, com dois valores distintos. Exibir o maior deles

        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.printf("Informe o primeiro numero: ");
        a = ler.nextInt();

        System.out.printf("Informe o segundo numero: ");
        b = ler.nextInt();

        if (a > b) {
            System.out.printf("O maior n�mero � %d ", a);
        } else
            System.out.printf("O maior n�mero � %d ", b);

    }
}
