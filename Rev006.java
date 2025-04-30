/*
Faça um Programa que pergunte quanto você ganha por hora e o número de horas 
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
*/
import java.util.Scanner;
public class Rev006
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double Celsius = 0;

    System.out.print("Digite a temperatura em graus Farenheit : ");
    double GrausFarenheit = scanner.nextDouble();
    
    Celsius = (5 * (GrausFarenheit-32) / 9);
    
    System.out.print("O salario no referido mês sera de : "+Celsius);
    }
}

	