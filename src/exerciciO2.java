//Nome: Pedro Lucas Mendes Blascke
//RA: 12523130724
//Nome do programa: exerciciO2
//Data: 13/04/2023

import java.util.Scanner;

public class exerciciO2 {
    public static void main(String[] args) throws Exception {
        //Exercício 2- Construa um programa que receba como entrada três valores A, B e C e os imprima em ordem crescente.
        Double a, b, c;
        Scanner teclado;

        System.out.println("Escreva três valores numéricos ");
        teclado = new Scanner (System.in);
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        teclado.close();
                                                                
        if (a < b && b < c){                                             
                System.out.println(a +"-"+ b +"-"+ c);
            }
            else if (a < c) {
                System.out.println(a +"-"+ c +"-"+ b);
            } else {
                System.out.println(c +"-"+ a +"-"+ b);
            }
        
            if (b < c && a < c) {
                System.out.println(b +"-"+ a +"-"+ c);
                } else {
                    System.out.println(b +"-"+ c +"-"+ a);   
                } 
            


    }
}