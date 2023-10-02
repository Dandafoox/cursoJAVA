/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0210;

import java.util.Scanner;



public class vetor4 {


    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
      int numero[] = new int[5];
       //int dobro[] = new int[5];   
       
      for (int i=0;i<=4;i++){
          System.out.println("Digite numero: ");
          numero[i] = sc.nextInt();
          //dobro[i]= numero[i]*2;
      }
      
      for (int i=0;i<=4;i++){
          System.out.println("O Dobro: ["+(i+1)+"] "+numero[i]+" = "+numero[i]*2);
          // System.out.println("O Dobro: " +vetor[i]+ "= "+dobro[i]);
      }
      
      
    }
    
}
