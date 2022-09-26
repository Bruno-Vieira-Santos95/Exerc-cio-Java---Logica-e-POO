package Ex53;


import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Aluno[] listaAluno = new Aluno[5];

        for (int i=0; i<=4; i++){

            Aluno a = new Aluno();

            System.out.printf("\nDigite o RA do aluno: ");
            a.ra = ler.next();

            System.out.printf("Digite o Nome do aluno: ");
            a.nome = ler.next();

            System.out.printf("Digite o Período (Manhã = m, Tarde = t ou Noite = n): ");
            a.periodo = ler.next();

            System.out.printf("Digite as Materias do aluno: ");

            for (int j = 0; j <= 5; j++){
                System.out.printf("Iniciais das %d º matérias", j + 1);
                System.out.println("");
                a.materias[j] = ler.next();
            }
            System.out.println("");

            listaAluno[i] = a;

        }



        for (int k=0; k<5; k++){
            if (listaAluno[k].periodo.equals("n") || listaAluno[k].periodo.equals("N")) {
                System.out.println("Alunos que cursam o Período Noturno: ");
                System.out.println(listaAluno[k].nome);

            }
        }
    }
}
