/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0210;

import java.util.Scanner;



public class Matriz1  {

//Leia 9 números inteiros em uma matriz 3 x 3. Ao final imprima os valores
//armazenados.
// bidimensional, usa linhas e colunas. Dimensional, só linhas.
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int numeros[][] = new int [3][3]; //primeiro colchetes sempre é linha
      
      for (int i=0;i<=2;i++){
          for (int j=0;j<=2;j++){
              System.out.println("Digite o Numero:");
              numeros[i][j]= sc.nextInt();
          }      
      }
      //fora do for pra não repetir, tudo que tá dentro do for é repetido.
     System.out.println("Numeros armazenados na Matriz de Dados");
        
       for (int i=0;i<=2;i++){
           System.out.println(""); //para pular linha
          for (int j=0;j<=2;j++){
              System.out.print (numeros[i][j]+" "); //ln é de line, para dar espaço é só dá espaço dentro das aspas
            }
       }

    }
    
}
