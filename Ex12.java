/*

Ex12 
Tempo do alistamento

*/

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrar com a idade: ");
        int idade = scanner.nextInt();
        
        if (idade < 18) {
            System.out.println("Faltam " + (18 - idade) + " anos para o alistamento.");
        } else if (idade == 18) {
            System.out.println("Está na idade de se alistar!");
        } else {
            System.out.println("Já se passaram " + (idade - 18) + " anos do período de alistamento.");
        }
        
        scanner.close();
    }
}