/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0210;

import java.util.Scanner;



public class vetor3 {

//Leia o nome e a idade de 5 pessoas em vetor. Ao final mostrar o nome e a idade
//de todos.
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
         
      int idade[] = new int[5];
      String nome[] = new String[5];
      
       for (int i=0;i<=4;i++){
          System.out.println("Digite Nome:");
          nome[i] = sc.next();
          
          System.out.println("Digite sua idade:");
          idade[i] = sc.nextInt();
        }
       
       for(int i=0;i<=4;i++){  
           System.out.println("********Dados da "+(i+1)+"a Pessoa****** ");
           System.out.println("Nome = "+nome[i]);
           System.out.println("Idade = "+idade[i]);      
       }   
          
      }

      
      
      
     
      
      
    }
    
}
