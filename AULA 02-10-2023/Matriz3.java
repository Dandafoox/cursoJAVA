/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0210;

import java.util.Scanner;


public class Matriz3  {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int matriz[][] = new int [5][2]; 
      int dobro[][] = new int[5][2]; 
      
      for (int i=0;i<=4;i++){
          for (int j=0;j<=1;j++){
              System.out.println("Digite o Numero:");
              matriz[i][j]= sc.nextInt();
              dobro[i][j] = matriz [i][j]*2;
          }      
      }
      //fora do for pra não repetir, tudo que tá dentro do for é repetido.
     System.out.println("O dobro dos numeros na Matriz de Dados");
        
       for (int i=0;i<=4;i++){
        System.out.println(""); // para pular linha
          for (int j=0;j<=1;j++){
          System.out.print ("O dobro de: " +matriz[i][j]+ " e = " +dobro[i][j]+" ");
              
            } 
       }

    }
    
}
