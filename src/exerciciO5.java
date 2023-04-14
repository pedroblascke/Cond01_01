//Nome: Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa: exerciciO5
//Data: 13/04/2023

import java.util.Scanner;

public class exerciciO5 {
    public static void main(String[] args) throws Exception {
        //Exercício 5- Faça um programa para imprimir o conceito de um aluno. O conceito é calculado em função da nota do aluno que varia de 0 a 100. As faixas da correlação são mostradas abaixo: Nota Conceito 0 a 49 Insuficiente 50 a 64 Regular 65 a 84 Bom 85 100 Ótimo

        Scanner sc = new Scanner(System.in);
        // Entrada de dados
        System.out.print("Digite a nota do aluno: ");
        int nota = sc.nextInt();

        // Cálculo do conceito
        String conceito;
        if (nota >= 0 && nota < 50) {
            conceito = "Insuficiente";
        } else if (nota >= 50 && nota < 65) {
            conceito = "Regular";
        } else if (nota >= 65 && nota < 85) {
            conceito = "Bom";
        } else if (nota >= 85 && nota <= 100) {
            conceito = "Ótimo";
        } else {
            System.out.println("Nota inválida. Tente novamente.");
            sc.close();
            return;
        }

        // Impressão do conceito
        System.out.println("O conceito do aluno é " + conceito);

        sc.close();
    }
}


