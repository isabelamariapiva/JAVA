/*
Ex 33
Faça um programa que leia 10 números e informe a soma e a média dos números.
*/
import java.util.Scanner;
public class Ex33 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int qntdn = 1,n = 0, soma = 0, media;
    while(qntdn <= 10){
    System.out.println("Insira o " + qntdn + "° número inteiro qualquer:");
    n = ler.nextInt();
    soma += n;
    qntdn++;
    }

    media = soma/10;

    System.out.println("Média dos dez números somados juntos é igual a  " + media + ".");
    }
}