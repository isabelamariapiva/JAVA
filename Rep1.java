/*
1.Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares 
de 51 a 100 utilizando um laço de repetição. Utilize while.
*/
import java.util.Scanner;
public class Rep1
{
    public static void main(String[] args) {
    int numImpar = 51;
    int numPar = 0;
    int num;
    
    System.out.print("Os numeros pares são: ");
    while (numPar <= 50){
        if ( numPar % 2 == 0){
            System.out.print("\n"+numPar);
        }
        numPar++;
    }
    
    System.out.print("\nOs numeros impares são: ");
    while (numImpar <= 100){
     if ( numImpar % 2 != 0){
            System.out.print("\n"+numImpar);
        }
        numImpar++;
    }
    }
}