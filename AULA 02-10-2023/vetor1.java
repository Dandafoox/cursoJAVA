/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0210;

import java.util.Scanner;



public class vetor1 {

//Leia o nome de 5 usuários em vetor e ao final imprima todos os nomes na tela.
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
              
        String nome[]= new String[5];
        
        for(int i=0;i<=4;i++){
            System.out.println ("Digite Seu nome:");
            nome[i] = sc.next();
           }
        
        for(int i=0;i<=4;i++){
         System.out.println ("Nome " +(i+1)+ " = "+nome[i]);
        }
    }
    
}
