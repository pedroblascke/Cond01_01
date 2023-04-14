//Nome: Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa: exerciciO3
//Data: 13/04/2023

import java.util.Scanner;

public class exerciciO3 {
    public static void main(String[] args) throws Exception {
        //Exercício 3- Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se é positivo ou negativo.
        int a;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        a = teclado.nextInt();
        teclado.close();

        if (a % 2 == 0) {
            System.out.print("O número é par ");
        } 
        else {
            System.out.print("O número é impar ");
        }
        if (a > 0) {
            System.out.print("e positivo!");
        }
        else {
            System.out.print("e negativo!");
        } 
        
        }

    } 









