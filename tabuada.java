/*

 exemplo tabuada 
 
*/

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        
        System.out.print("Digite um número para ver a tabuada: ");
        n = ler.nextInt();
        
        System.out.println("Tabuada do " + n + ":");
        for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x  " + i + " = " + (n * i));
        }
        
        ler.close();
    }
}
