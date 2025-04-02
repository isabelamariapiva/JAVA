/*

Ex18 
Leia a idade de 20 pessoas e exiba a soma das idade, a média das idades e quantas pessoas são maiores de idade.
  
*/

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        int soma = 0;
        int pmaior18 = 0;
        int pmenor18 = 0; 

        for(int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: "); 
            int idade = ler.nextInt();
            soma += idade; 
            
            if (idade >= 18) {
                pmaior18++; 
            } else {
                pmenor18++; 
            }
        }

        double media = (double) soma / 20; 

        
        System.out.println("\nA soma das idades inseridas é: " + soma);
        System.out.println("A média das idades inseridas é: " + media);
        System.out.println("A quantidade de pessoas maiores de idade é: " + pmaior18);
        System.out.println("A quantidade de pessoas menores de idade é: " + pmenor18);

    }
}