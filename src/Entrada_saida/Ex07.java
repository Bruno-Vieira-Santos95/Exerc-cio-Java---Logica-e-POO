package Entrada_saida;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        // 7. Entrar via teclado com o valor de cinco produtos. Ap�s as entradas, digitar um valor referente ao pagamento da somat�ria destes valores. Calcular e exibir o troco que dever� ser devolvido.

        Scanner ler = new Scanner(System.in);

        double somaprodutos, p1, p2, p3, p4, p5, valortroco, pagamento;

        System.out.printf("Informe o valor do primeiro produto: ");
        p1 = ler.nextDouble();

        System.out.printf("Informe o valor do segundo produto: ");
        p2 = ler.nextDouble();

        System.out.printf("Informe o valor do terceiro produto: ");
        p3 = ler.nextDouble();

        System.out.printf("Informe o valor do quarto produto: ");
        p4 = ler.nextDouble();

        System.out.printf("Informe o valor do quinto produto: ");
        p5 = ler.nextDouble();

        System.out.printf("Informe a quantia do pagamento: ");
        pagamento = ler.nextDouble();

        somaprodutos = p1 + p2 + p3 + p4 + p5;
        valortroco = pagamento - somaprodutos;

        System.out.printf("O valor do troco ser� de R$ %.2f ", valortroco);

    }
}
