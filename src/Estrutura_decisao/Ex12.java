package Estrutura_decisao;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        // 12. Calcular e exibir a �rea de um ret�ngulo, a partir dos valores da base e altura que ser�o digitados. Se a �rea for maior que 100, exibir a mensagem �Terreno grande�, caso contr�rio, exibir a mensagem �Terreno pequeno�.

        Scanner ler = new Scanner(System.in);

        int area, base, altura;

        System.out.printf("Informe o tamanho da base: ");
        base = ler.nextInt();

        System.out.printf("\n Informe o tamanho da altura: ");
        altura = ler.nextInt();

        area = base * altura;

        System.out.printf("\n O tamanho da �rea � %d cm�\n", area);

        if (area > 100) {
            System.out.printf("Terreno Grande");
        } else {
            System.out.printf("Terreno Pequeno");
        }

    }
}
