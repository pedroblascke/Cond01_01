//Nome: Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa: exerciciO6
//Data: 13/04/2023

import java.util.Scanner;

public class exerciciO6 {
    public static void main(String[] args) throws Exception {
        //Exercício 6-  Faça um programa calcula o total de uma hospedagem em um hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
        
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número de diárias: ");
        int numDiarias = sc.nextInt();

        // Cálculo do valor da hospedagem
        double valorDiaria = 60.0;
        double taxaServico;
        if (numDiarias > 15) {
            taxaServico = 5.5;
        } else if (numDiarias == 15) {
            taxaServico = 6.0;
        } else {
            taxaServico = 8.0;
        }

        double valorHospedagem = numDiarias * valorDiaria + numDiarias * taxaServico;

        // Impressão do valor da hospedagem
        System.out.printf("O valor total da hospedagem é R$ %.2f\n", valorHospedagem);

        sc.close();
    } 
}
