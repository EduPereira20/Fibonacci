/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

import java.util.Scanner;

/**
 *
 * @author 55619
 */
public class Fibonacci {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Digite um número para verificar se está na sequência de Fibonacci ou digite -5 para sair: ");
            int numero = sc.nextInt();
            
            if(numero == -5) {
                break;
            }
       
            if (SequenciaFibonacci(numero)) {
                System.out.println(numero + " pertence a sequência de Fibonacci.");
            } else {
                System.out.println(numero + " não pertence a sequência de Fibonacci.");
            }
        }
        
        sc.close(); 
    }
    public static boolean SequenciaFibonacci(int numero) {
        int x = 0;
        int y = 1;
        
        while (y < numero) {
            int proximo = x + y;
            x = y;
            y = proximo;
        }
        return y == numero;
}
}