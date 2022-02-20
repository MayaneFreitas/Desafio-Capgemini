
package Resposta01;

import java.util.Scanner;
public class Resposta01 {

   public static void main(String[] args) {
       // criar o objeto que lê o que for digitado
      Scanner scan = new Scanner (System.in);
       // inserir tamanho da escada
      System.out.print("Digite o tamanho da escada:");
      int valor = scan.nextInt();
      //cria uma variavel "esp" espaço  e substiui o tipo de String para caracter, essa variavel são os espaços em branco da escada
      String esp= new String( new char[valor]).replace("\0", " ");
      
      for (int i=1; i<= valor; i++)
      {
   // criar a variavel asterisco "ast" que será implementado pelo for
      String ast= new String( new char[i]).replace("\0", "*");
      //manipula a String espaço" esp" através da substring e concatena com a variavel asterisco
    System.out.println(esp.substring(0, esp.length()-i)+ ast);
      }
      scan.close();
      
   }
   } 
    

