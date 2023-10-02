/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0210;

import java.util.Scanner;



public class vetor2 {

//Leia 10 numeros inteiros e ao final mostre os números lidos.
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
      int numero[] = new int[10];
      
      for (int i=0;i<=9;i++){
          System.out.println("Digite numero:");
          numero[i] = sc.nextInt();
      }
      
      for (int i=0;i<=9;i++){
          System.out.println("Numero na posicao["+(i+1)+"]= "+numero[i]);
          
      }
      
      
    }
    
}
