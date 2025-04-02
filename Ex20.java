/*

Ex20 
 Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200. 

*/
import java.util.Scanner;

public class Ex20 {
   public static void main(String[] args) {
   Scanner ler = new Scanner(System.in); 
   int n0a100 = 0;
   int n101a200 = 0;
   int maior200 = 0;

    for(int i = 1; i <= 20; i++) {
    System.out.print("Digite o " + i + "º numero: "); 
    int n1 = ler.nextInt();
   
    if (n1 >= 0 && n1 <= 100) {
    n0a100++;
    } else if ( n1 >= 101 && n1 <= 200){
    n101a200++; 
    } else {
   maior200++;
        }
    }
        
    System.out.println("\nA quantidade de numeros entre 0 e 100 é de: " +n0a100);
    System.out.println("A quantidade de numeros entre 101 e 200 é de: " + n101a200);
    System.out.println("A quantidade de numeros que sao maiores que 200 é de: " + maior200);

    }
}