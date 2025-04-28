/*
4.Crie um programa que solicite ao usuário um número e exiba a 
tabuada desse número utilizando um laço de repetição. Utilize for.
*/
import java.util.Scanner;
public class Rep4 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, multinatabu;

        System.out.print("Insira um numero para visualizar sua respectiva tabuada: ");
        num = ler.nextInt();

        System.out.println("Tabuada do numero "+ num + ":");
        for(int i = 1; i <= 10; i++) {
        multinatabu = num * i;
                System.out.println(num + "x" + i + " = " + multinatabu);
        }
        
    }
}