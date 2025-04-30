/*
Rev007
Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
usando a seguinte fórmula: (72.7*altura) - 58
*/
import java.util.Scanner;
public class Rev007
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double pesoideal= 0;

    System.out.print("Digite a altura: ");
    double altura = scanner.nextDouble();
    
    pesoideal= (72.7*altura) - 58;
    
    System.out.println("Seu peso ideal è: "+pesoideal);
    }
}

	