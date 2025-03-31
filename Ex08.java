/*
Ex Ex08
calcular peso ideal

*/
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();
        
        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);
        
        double peso;
        if (sexo == 'M' || sexo == 'm') {
            peso = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            peso = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
            scanner.close();
            return;
        }
        
        // Saída do resultado
        System.out.printf("O peso ideal é: %.2f kg\n", peso);
        
        scanner.close();
	}
}