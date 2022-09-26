package Estrutura_decisao;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        // 10. Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos.

        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.printf("Informe o primeiro numero: ");
        a = ler.nextInt();

        System.out.printf("Informe o segundo numero: ");
        b = ler.nextInt();

        if (a > b) {
            System.out.printf("O maior n�mero � %d ", a);
        } else if (b > a){
            System.out.printf("O maior n�mero � %d ", b);
        } else {
            System.out.printf("Os n�meros s�o id�nticos");
        }
    }
}
