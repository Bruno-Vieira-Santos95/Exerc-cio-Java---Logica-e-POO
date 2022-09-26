package Ex52;

import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Produto[] listaProduto = new Produto[10];

        for (int i=0; i<=9; i++){

            Produto p = new Produto();

            System.out.printf("\nDigite o Id do produto: ");
            p.id = ler.nextInt();

            System.out.printf("Digite a Descrição do produto: ");
            p.descricao = ler.next();

            System.out.printf("Digite o Valor do produto: ");
            p.valor = ler.nextDouble();

            System.out.printf("Digite a Quantidade do produto: ");
            p.quantidade = ler.nextDouble();

            listaProduto[i] = p;
        }

        for (int i=0; i<=9; i++){
            if (listaProduto[i].valor < 100){
                System.out.printf("\n Cliente: %d, %s, %.2f, %.2f", listaProduto[i].id, listaProduto[i].descricao,
                        listaProduto[i].valor, listaProduto[i].quantidade);
            }
        }
    }
}
