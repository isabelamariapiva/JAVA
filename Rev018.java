/*
Rev018
Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
*/
import java.util.Scanner;
public class Rev018 {
public  static void main (String[]args) {
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Insira o primeiro numero: ");
    int numero1 = scanner.nextInt();
    
    System.out.print("Insira o segundo numero: ");
    int numero2 = scanner.nextInt();
    
    if(numero1 < numero2) {
    for(int i = numero1; i < numero2; i++){
    System.out.print("\n"+i);
    }
    } else if(numero1 > numero2) {
    for(int i = numero2; i < numero1; i++){
    System.out.print("\n"+i);
    }
    }
}
}

   
    
   


  