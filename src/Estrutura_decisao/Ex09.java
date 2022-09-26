package Estrutura_decisao;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        // 9. Entrar via teclado, com dois valores distintos. Exibir o menor deles.

        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.printf("Informe o primeiro numero: ");
        a = ler.nextInt();

        System.out.printf("Informe o segundo numero: ");
        b = ler.nextInt();

        if (a < b) {
            System.out.printf("O menor n�mero � %d ", a);
        } else
            System.out.printf("O menor n�mero � %d ", b);

    }
}
