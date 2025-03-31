/*
Ex16
Leia o nome do usario e escrve na tela 10 vezes 

*/

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Escreva seu nome: ");
    String nome = scanner.nextLine();


    for (int i = 0; i < 10; i++) {
    System.out.println((i + 1) + ": " + nome);
    }

    scanner.close();
    }
}