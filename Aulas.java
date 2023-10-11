// AULA JAVA -25/09/2023

//Alt+enter = add classe (importar)
//Escrever sout e apertar tab para escrever System.ou.Println
//Scanner = para fazer pergunta

Atividade:

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaescolar;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Mediaescolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Double n1,n2,n3,n4,media;
        
        System.out.println("Digite a nota do 1o Bimestre:");
        n1 = sc.nextDouble();
        
        System.out.println("Digite a nota do 2o Bimestre:");
        n2 = sc.nextDouble();
        
        System.out.println("Digite a nota do 3o Bimestre:");
        n3 = sc.nextDouble();
        
        System.out.println("Digite a nota do 4o Bimestre:");
        n4 = sc.nextDouble();
        
       media = (n1+n2+n3+n4)/4;
       
       if (media>=6){
           System.out.println("Aluno aprovado - Media =" +media);

//Uso do else if, pode ser usado de duas formas: 

//primeira:

       if (media>=6){
           System.out.println("Aluno aprovado - Media =" +media);
       }
       else if (media>=3){
           System.out.println("Aluno recuperaçao - Media = "+media);
       } 
       else{
           System.out.println("Aluno reprovado - Media = "+media);
       } 

//segunda:


       if (media <3){
           System.out.println("Aluno Reprovado");
       }
       else if (media <=5.9) {
           System.out.println("Aluno de recuperacao");
       }
       else {
           System.out.println("Aluno Aprovado");
       }
}}



//Mais exemplos de else if

        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("Digite nome da criança: ");
          nome = sc.next();
          
          System.out.println("Digite a idade da criança");
          idade = sc.nextInt();
          
          if (idade <=2){
              System.out.println("Encaminhar para o berçário");
          } else if (idade<=4){
              System.out.println("Encaminhar para o Infantil A");
          } else if (idade<=5){
              System.out.println("Encaminhar para o Infantil B");
          } else if (idade<=6){
              System.out.println("Encaminhar para o Infantil C");
       } else {
              System.out.println("Criança fora da Tabela");
          }          
          
    }}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaescolar;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class infantil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("Digite nome da criança: ");
          nome = sc.next();
          
          System.out.println("Digite a idade da criança");
          idade = sc.nextInt();
          
          if (idade <=2){
              System.out.println("A Crianca " +nome+ " Deve ser encaminhada para o Berçario");
          } else if (idade<=4){
              System.out.println("A Crianca " +nome+ " Deve ser encaminhada para o Infantil A");
          } else if (idade<=5){
              System.out.println("A Crianca " +nome+ " Deve ser encaminhada para o Infantil B");
          } else if (idade<=6){
              System.out.println("A Crianca " +nome+ " Deve ser encaminhada para o Infantil C");
       } else {
              System.out.println("A Criança fora da Tabela");
          }          
          
    }}





//Atividade de IMC:


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaescolar;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String nome, classi;
        Double idade, peso, altura,imc;
        
        System.out.println("Digite seu nome:");
        nome = sc.next();
        
        System.out.println("Digite sua idade:");
        idade = sc.nextDouble();
        
        System.out.println("Digite seu peso:");
        peso = sc.nextDouble();
        
                
        System.out.println("Digite sua altura:");
        altura = sc.nextDouble();
        
        imc = peso/(altura*altura);
        
             
        if (imc<18.5){
           classi = "Abaixo do peso normal";
       }
       else if (imc <=24.9){
            classi = "Peso normal";
       } 
       else if (imc <=29.9)
       {
           classi = "Excesso de Peso";
       } 
       else if (imc <=34.9){
           classi = "Obesidade classe l";       
       }
       else if (imc <=39.9){
          classi = "Obesidade classe 2";       
       } 
       else {
          classi = "Obesidade classe 3";       
       } 
        
        
          System.out.println("Nome:" +nome+"");
          System.out.println("Idade:" +idade+"");
          System.out.println("Peso:" +peso+"");
          System.out.println("Altura:" +altura+"");
          System.out.println("Seu Imc é :" +imc+"");
          System.out.println("Sua classificação é :" +classi+"");
       }}



//Mais uma forma 



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaescolar;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class imc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String nome, classi;
        Double peso, altura,imc;
        int idade;
                
        System.out.println("Digite seu nome:");
        nome = sc.next();
        
        System.out.println("Digite sua idade:");
        idade = sc.nextInt();
        
        System.out.println("Digite seu peso:");
        peso = sc.nextDouble();        
                
        System.out.println("Digite sua altura:");
        altura = sc.nextDouble();
        
        imc = peso/(altura*altura);
        
             
        if (imc<18.5){
           classi = "Abaixo do peso normal";
       }
       else if (imc <=24.9){
            classi = "Peso normal";
       } 
       else if (imc <=29.9)
       {
           classi = "Excesso de Peso";
       } 
       else if (imc <=34.9){
           classi = "Obesidade classe l";       
       }
       else if (imc <=39.9){
          classi = "Obesidade classe 2";       
       } 
       else {
          classi = "Obesidade classe 3";       
       } 
        
        
          System.out.println("Nome: " +nome+ " Idade: " +idade);
          System.out.println("Peso: " +peso+ " Altura: " +altura);
          System.out.println("Seu IMC é = " +imc);
          System.out.println("Sua classificicao foi: " +classi);

       }}

//REPETIÇÃO = for (int i=1;i<=3;i++){



//AULA 02/10/2023: SEGUNDA-FEIRA

https://dontpad.com/mulheresjava



REPETIÇÃO

EXERCICIO:3

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



//Leia o nome de 5 usuários em vetor e ao final imprima todos os nomes na tela.


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


//Leia 10 numeros inteiros e ao final mostre os números lidos.

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


    
//Leia o nome e a idade de 5 pessoas em vetor. Ao final mostrar o nome e a idade de todos.


    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0210;

import java.util.Scanner;



public class vetor3 {

//Leia o nome e a idade de 5 pessoas em vetor. Ao final mostrar o nome e a idade de todos.
    
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
       
        for (int i=0;i<=4;i++){
          System.out.println("Nome:" +(i+1)+ "="  +nome[i]+ "  Idade:" +(i+1)+ " = " +idade[i]);
          
          //  OUTRA FORMA DE ESCREVER
          // for(int i=0;i<=4;i++){  
          // System.out.println("********Dados da "+(i+1)+"a Pessoa****** ");
          // System.out.println("Nome = "+nome[i]);
          // System.out.println("Idade = "+idade[i]);      
       }   
         
      }
    }
    
}

//Leia 9 números inteiros em uma matriz 3 x 3. Ao final imprima os valores armazenados.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0210;

import java.util.Scanner;


public class Matriz1  {

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
              System.out.print (numeros[i][j]+" "); //ln é de line. Para dar espaço entre os num é só dá espaço dentro das aspas
            }
       }

        
    }
    
}

//1) Desenvolva um programa que guarde 10 números inteiros em uma matriz 5 x 2. Ao final mostrar o dobro dos números que foram armazenados; ou seja; se foi digitado o número 2 imprima :
//Dobro de 2 = 4


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0210;

import java.util.Scanner;



public class Matriz2  {


    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int numeros[][] = new int [5][2]; 
      
      for (int i=0;i<=4;i++){
          for (int j=0;j<=1;j++){
              System.out.println("Digite o Numero:");
              numeros[i][j]= sc.nextInt();
          }      
      }

     System.out.println("O dobro dos numeros na Matriz de Dados");
        
       for (int i=0;i<=4;i++){
           System.out.println(""); //para pular linha
          for (int j=0;j<=1;j++){
              System.out.print ("O dobro de: " +numeros[i][j]+ " e = " +numeros[i][j]*2+" ");
              
            } 
       }

    }
    
}

// Desenvolva um programa que guarde 5 números inteiros em um vetorA. ao final mostrar o dobro dos números que foram armazenados; ou seja; se foi digitado o número 2 imprima :
//Dobro de 2 = 4


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0210;

import java.util.Scanner;



public class vetor4 {

//Leia 10 numeros inteiros e ao final mostre os números lidos.
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
      int numero[] = new int[5];
                         
      for (int i=0;i<=4;i++){
          System.out.println("Digite numero: ");
          numero[i] = sc.nextInt();
      }
      
      for (int i=0;i<=4;i++){
          System.out.println("O Dobro: ["+(i+1)+"] "+numero[i]+" = "+numero[i]*2);
          
      }
      
      
    }
    
}

//correção da professora


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


//corregido pela professora

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


// AULA 09/10/2023


//controller

package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;

/**
 * Servlet implementation class ClienteController
 */

@WebServlet({"/ClienteController","/novocliente"}) // rota para chamar os outros. Tomcat nove já vem com a rota

public class ClienteController extends HttpServlet { //chamar a classe
	
	
	Cliente cli= new Cliente();
	
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String acao = request.getServletPath();
		if (acao.equals ("/novocliente")) {
			 EnviaDados(request,response);
		} 
	}
	
	protected void EnviaDados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //classe
		 cli.setIdcliente(Integer.parseInt (request.getParameter("idcliente"))); // request = requisição, Integer.paserInt para modificar letra pra numero, conversor.
		 cli.setNome(request.getParameter("nome"));
		 cli.setTelefone(request.getParameter("telefone"));
		 
		 PrintWriter pw = response.getWriter(); // PARA MOSTRAR/CHAMAR NA TELA
		 pw.println (cli.getNome());
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


// model



package model;

public class Cliente {
	
	private int idcliente;
	private String nome;
	private String telefone;
	
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cliente(int idcliente, String nome, String telefone) {
		super();
		this.idcliente = idcliente;
		this.nome = nome;
		this.telefone = telefone;
	}


	public int getIdcliente() {
		return idcliente;
	}


	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}


// view

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Cadastro de Cliente </title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
 <div class ="container">
		
		<form action = "novocliente" method ="">
			  <div class="form-group">
			    <label for="idcliente">Código do Cliente</label>
			    <input type="text" class="form-control" id="" name = "idcliente">
			  </div>
			  
			  <div class="form-group">
			    <label for="nome"> Nome </label>
			    <input type="text" class="form-control" id="" name= "nome">
			  </div>
			  
			  <div class="form-group">
			    <label for="telefone"> Telefone </label>
			    <input type="text" class="form-control" id="" name="telefone">
			  </div>
			  
			  <div class = "form group">
			   <input type ="submit" class = "btn btn-primary" value ="Enviar">
			  </div>
			  
		</form>
</div>

// <----BOTSTRAP--->
	
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>


	                                                          // AULA 11/10/2023 //


// CONTINUAÇÃO DO CÓDIGO ACIMA, IREMOS FAZER A LIGAÇÃO COM O BANCO DE DADOS 
// GET - PEGA. SET - MANDA
// Try o que vai acontecer
// cacth - executa o que está no try, caso der erro. Tratamento de erro. 
//DAO - DATA ACESS OBJECT - Acesso ao objeto no banco
// preparedStatement e prepare Statement - um pega e outro executa
	// ao trabalhar com banco sempre usar Try e cacth (trai e cat)













	
