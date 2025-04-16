/*
Ex- 48
leia um conjunto de 10 valores reais, guarde-os
em um vetor, calcule a soma dos valores armazenados em posicões ímpares
e escreva o resultado.
*/
import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        double[] numeros = new double[10]; 
        Scanner scanner = new Scanner(System.in);
        double soma = 0; 
    
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numeros[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 10; i += 2) {
            soma += numeros[i];
        }

        System.out.println("A soma dos valores nas posições ímpares é: " + soma);

    }
}
