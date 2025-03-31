/*
Ex10
valor gasto: gasolina e alcool
*/
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite o tipo de combustivel (G - gasolina, A - álcool): ");
        char TC = scanner.next().toUpperCase().charAt(0);
        System.out.print("Digite a capacidade do tanque (em litros): ");
        double l = scanner.nextDouble();
        
        double Gasolina = 1.80;
        double Alcool = 1.00;
        double VG;
        
        // Cálculo do valor gasto para encher o tanque
        if (TC == 'G') {
            VG = l * Gasolina;
        } else if (TC == 'A') {
            VG = l *Alcool;
        } else {
            System.out.println("Tipo de combustível inválido.");
            scanner.close();
            return;
        }
        
        // Exibir o valor gasto
        System.out.println("Valor gasto para encher o tanque: R$ " + VG);
        
        scanner.close();
    }
}
