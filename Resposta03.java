
package resposta03;
import java.util.Scanner;
import java.util.Arrays;

public class Resposta03 {
  public static void main(String[] args) {
       //ler a entrada de dados do teclado
         Scanner scr = new Scanner(System.in);
         //Pedir ara o usuario digitar a alavra
         System.out.print("digite a palavra:");
        // fazer a leitura do que foi digitado e retornar uma String dentro da variavel "palavra
         String palavra =scr.next();
         System.out.println(" ");
         System.out.printf("palavra %s:", palavra);
        contarAnagramas(palavra);
        scr.close();
        
}

    public static void contarAnagramas(String n) {
        String[] array =new String[100];
        int contador=0;
        int pares =0;
        
        for (int i=0; i<n.length(); i++){
            for(int j=i; j< n.length(); j++){
                //quebrar em substrig secificada
                String temp= n.substring(i, j+1);
                //transformar a substring em array de char ara ordenar
                char[] ordenar= temp.toCharArray();
                //ordenar a substring retirada
                Arrays.sort(ordenar);
                //converter o array de char em String
                // inserir o valor do array com incremento
                array[contador]=String.valueOf(ordenar);
                contador++;
                 }
      }
        // comparar substrings
        for (int i=0; i<contador; i++){
            for(int j= i; j<contador; j++){
                if(array[1].equals(array[j+1])){
                    pares++;
                    
                }
            }
        }
        System.out.println(pares);
    }
        
       
    
}
