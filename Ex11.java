/*

 Ex11
 saldo médio de um cliente e calculo do valor do crédito de acordo com dados

*/
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do saldo médio
        System.out.print("Digite o saldo médio do último ano: ");
        double saldo = scanner.nextDouble();
        double credito;
        
        if (saldo >= 0 && saldo <= 200) {
            credito = 0;
        } else if (saldo <= 400) {
            credito = saldo * 0.20;
        } else if (saldo <= 600) {
            credito = saldo * 0.30;
        } else {
            credito = saldo* 0.40;
        }
        
        // Exibir resultado
        System.out.println("Saldo médio: R$ " + saldo);
        System.out.println("Crédito especial concedido: R$ " + credito);
        
        scanner.close();
    }
}