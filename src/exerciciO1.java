//Nome: Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa: exerciciO1
//Data: 13/04/2023

import java.util.Scanner;

public class exerciciO1 {
    public static void main(String[] args) throws Exception {
        //Exercício 1- Faça um programa que leia dois números A e B e imprima o maior deles.
        Double a,b;
        Scanner teclado;

        System.out.println("Escreva dois números aleatórios: ");
        teclado = new Scanner (System.in);
        a = teclado.nextDouble();
        b = teclado.nextDouble();

        teclado.close();

        if (a > b) {
            System.out.println("O maior número é o: " + a);
        }
        else {
            System.out.println("O maior número é o: " + b);  
        }
    }
}

