package Ex51;

import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Cliente[] listaClientes = new Cliente[10];

        for (int i=0; i<=4; i++){

            Cliente c = new Cliente();

            System.out.printf("\nDigite o Id do cliente: ");
            c.id = ler.nextInt();

            System.out.printf("Digite o Nome do cliente: ");
            c.nome = ler.next();

            System.out.printf("Digite o Idade do cliente: ");
            c.idade = ler.nextInt();

            System.out.printf("Digite o Email do cliente: ");
            c.email = ler.next();

            listaClientes[i] = c;
        }

        for (int i=0; i<=4; i++){
            if (listaClientes[i].idade > 18){
                System.out.printf("\n Cliente: %d, %s, %d, %s", listaClientes[i].id, listaClientes[i].nome,
                        listaClientes[i].idade, listaClientes[i].email);
            }
        }
    }
}
