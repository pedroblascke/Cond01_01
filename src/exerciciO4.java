//Nome: Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa: exerciciO4
//Data: 13/04/2023

import java.util.Scanner;

public class exerciciO4 {
    public static void main(String[] args) throws Exception {
        //Exercício 4-  Faça um programa que leia o nome, o sobrenome, a idade, em anos, e a naturalidade (cidade de nascimento) de uma pessoa. Depois, o programa deve dar a seguinte opção “Deseja visualizar dados completos?”. Se o caractere digitado pelo usuário for ‘S’ o programa deve imprimir na tela Nome, Sobrenome, idade e naturalidade. Se o caractere digitado pelou suário for ‘N’ o programa deve imprimir o Nome e a idade. Seo caractere não for nenhuma das outras opções acima o programadeve imprimir “Digitação errada. Tente Novamente”.

        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Consumindo o buffer do teclado

        System.out.print("Digite a sua cidade de nascimento: ");
        String naturalidade = sc.nextLine();

        // Opção de visualização de dados
        System.out.print("Deseja visualizar dados completos? (S/N) ");
        String opcao = sc.nextLine();

        // Impressão dos dados de acordo com a opção escolhida
        if (opcao.equalsIgnoreCase("S")) {
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao.equalsIgnoreCase("N")) {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
        } else {
            System.out.println("Digitação errada. Tente novamente.");
        }

        sc.close();
    }
}

