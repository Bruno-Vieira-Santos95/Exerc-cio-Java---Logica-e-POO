package Estrutura_decisao;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        //13. Entrar via teclado com tr�s valores distintos. Exibir o maior deles.

        Scanner ler = new Scanner(System.in);

        int a, b,c;
        System.out.printf("valor 1: ");
        a=ler.nextInt();

        System.out.printf("valor 2: ");
        b=ler.nextInt();

        System.out.printf("valor 3: ");
        c=ler.nextInt();

        if(a>b&&a>c)
        {
            System.out.printf("O maior n�mero � %d", a);
        }
        else if (b>a&&b>c)
        {
            System.out.printf("O maior n�mero � %d",b);
        }
        else {
            System.out.printf("O maior n�mero � %d",c);
        }

    }
}
