//Nome: Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa: exerciciO7
//Data: 13/04/2023

import java.util.Scanner;

public class exerciciO7 {
    public static void main(String[] args) throws Exception {
        //Exercício 7- Crie um programa que lê um número entre 1 e 12, correspondendoa um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembroAo final, o programa deve imprimir uma mensagem identificando,com base no número digitado, o nome do mês e a estação. 

        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um número de 1 a 12 correspondente a um mês do ano: ");
        int numMes = input.nextInt();

        // Verificação do número do mês e identificação do nome do mês e da estação
        String nomeMes;
        String estacao;
        switch (numMes) {
            case 1:
                nomeMes = "Janeiro";
                estacao = "Verão";
                break;
            case 2:
                nomeMes = "Fevereiro";
                estacao = "Verão";
                break;
            case 3:
                nomeMes = "Março";
                estacao = "Outono";
                break;
            case 4:
                nomeMes = "Abril";
                estacao = "Outono";
                break;
            case 5:
                nomeMes = "Maio";
                estacao = "Outono";
                break;
            case 6:
                nomeMes = "Junho";
                estacao = "Inverno";
                break;
            case 7:
                nomeMes = "Julho";
                estacao = "Inverno";
                break;
            case 8:
                nomeMes = "Agosto";
                estacao = "Inverno";
                break;
            case 9:
                nomeMes = "Setembro";
                estacao = "Primavera";
                break;
            case 10:
                nomeMes = "Outubro";
                estacao = "Primavera";
                break;
            case 11:
                nomeMes = "Novembro";
                estacao = "Primavera";
                break;
            case 12:
                nomeMes = "Dezembro";
                estacao = "Verão";
                break;
            default:
                nomeMes = "Mês inválido";
                estacao = "Estação inválida";
                break;
        }

        // Impressão do nome do mês e da estação correspondente
        System.out.println("Mês: " + nomeMes + " - Estação: " + estacao);

        input.close();



    }
}
