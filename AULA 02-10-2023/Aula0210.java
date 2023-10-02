/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0210;

import java.util.Scanner;



public class Aula0210 {

//Leia o nome de 5 usuários e depois imprima
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
              
        String nome;
        
        for(int i=1;i<=5;i++){
            System.out.println ("Digite Seu nome:");
            nome=sc.next();
            System.out.println ("Nome " +i+ " = "+nome);
        }
    }
    
}
