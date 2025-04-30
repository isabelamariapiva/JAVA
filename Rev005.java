/*
Faça um Programa que pergunte quanto você ganha por hora e o número de horas 
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
*/
import java.util.Scanner;
public class Rev005
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double SalarioMês = 0;

    System.out.print("Digite quanto você ganha por hora: ");
    double SalarioPorHora = scanner.nextDouble();
    
     System.out.print("Digite a quantidade de horas trabalhdas no mês: ");
    double HoraTrabalhada = scanner.nextDouble();
    
     SalarioMês = SalarioPorHora* HoraTrabalhada;
    
    System.out.print("O salario no referido mês sera de : "+SalarioMês);
    }
}

	