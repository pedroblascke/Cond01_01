//Nome: Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa: exerciciO9
//Data: 13/04/2023

import java.util.Scanner;

public class exerciciO9 {
    public static void main(String[] args) throws Exception {
        //Exercício 9- Faça um programa que receba o valor da venda, escolha a condição de pagamento no menu e mostre o total da venda final conforme condições a seguir:

        Scanner input = new Scanner(System.in);
        double valorVenda, valorFinal;
        int opcaoPagamento;

        System.out.print("Digite o valor da venda: ");
        valorVenda = input.nextDouble();

        System.out.println("Selecione a opção de pagamento:");
        System.out.println("1 - Venda à vista (desconto de 10%)");
        System.out.println("2 - Venda a prazo 30 dias (desconto de 5%)");
        System.out.println("3 - Venda a prazo 60 dias (mesmo preço)");
        System.out.println("4 - Venda a prazo 90 dias (acréscimo de 5%)");
        System.out.println("5 - Venda com cartão de débito (desconto de 8%)");
        System.out.println("6 - Venda com cartão de crédito (desconto de 7%)");

        opcaoPagamento = input.nextInt();

        switch (opcaoPagamento) {
            case 1:
                valorFinal = valorVenda * 0.9;
                System.out.printf("Valor final com desconto: R$ %.2f", valorFinal);
                break;
            case 2:
                valorFinal = valorVenda * 0.95;
                System.out.printf("Valor final com desconto: R$ %.2f", valorFinal);
                break;
            case 3:
                valorFinal = valorVenda;
                System.out.printf("Valor final: R$ %.2f", valorFinal);
                break;
            case 4:
                valorFinal = valorVenda * 1.05;
                System.out.printf("Valor final com acréscimo: R$ %.2f", valorFinal);
                break;
            case 5:
                valorFinal = valorVenda * 0.92;
                System.out.printf("Valor final com desconto: R$ %.2f", valorFinal);
                break;
            case 6:
                valorFinal = valorVenda * 0.93;
                System.out.printf("Valor final com desconto: R$ %.2f", valorFinal);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        input.close();
        
    } 
}
