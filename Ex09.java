/******************************************************************************

alor a ser pago pelo período de estacionamento do automóvel
*******************************************************************************/

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite a hora de entrada: ");
        int he = scanner.nextInt();
        System.out.print("Digite o minuto de entrada: ");
        int me = scanner.nextInt();
        System.out.print("Digite a hora de saída: ");
        int hs = scanner.nextInt();
        System.out.print("Digite o minuto de saída: ");
        int ms = scanner.nextInt();
        
        int Entrada = he * 60 + me;
        int Saida = hs * 60 + ms;
        
        int tempoTotal = Saida - Entrada;
        
        if (tempoTotal <= 0) {
            System.out.println("Horário inválido. Verifique os dados de entrada e saída.");
        } else {
            int horas = (int) Math.ceil(tempoTotal / 60.0);
            
            int valor;
            if (horas == 1) {
                valor = 4;
            } else if (horas == 2) {
                valor = 6;
            } else {
                valor = 6 + (horas - 2);
            }
            
            // Exibir o valor a ser pago
            System.out.println("Valor a ser pago: R$ " + valor + ",00");
        }
        
        scanner.close();
    }
}