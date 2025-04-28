/*
3.Crie um programa que solicite ao usuC!rio um nC:mero e exiba a
tabuada desse nC:mero utilizando um laC'o de repetiC'C#o. Utilize while.
*/
import java.util.Scanner;

public class Rep3 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, multinatabu, i = 0;

        System.out.print("Insira um numero para visualizar sua respectiva tabuada: ");
        num = ler.nextInt();

        System.out.println("Tabuada do numero "+ num + ":");
        while (i <= 9) {
            i++;
            multinatabu = num * i;
                    System.out.println(num + "x" + i + " = " + multinatabu);
        }
        
    }
}