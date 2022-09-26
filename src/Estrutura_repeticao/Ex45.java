package Estrutura_repeticao;

import java.util.Scanner;

public class Ex45 {

    public static void main(String[] args){


        int N = 0,aux=0, aux2=0, soma=0, aux3=0;
        int[] a = new int[N];

        Scanner ler = new Scanner(System.in);
        do
        {
            System.out.printf("Digite o valor de N: ");
            N = ler.nextInt();
            if(N < 0 || N>20)
            {
                System.out.println("Número inválido troxa!!");
            }
        }while(N < 0 || N > 20);
        for(int i=0; i < N;i++)
        {
            System.out.print("Digite um valor: ");
            a [i] = ler.nextInt();
            if(a[i] > aux)
            {
                aux = a[i];
            }
            soma += a[i];
            if(i==0)
                aux2 = a[i];
            if(a[i]<aux2)
                aux2 = a[i];
        }

    }
}
