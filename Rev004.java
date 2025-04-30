/*
Rev004
Faça um Programa que converta metros para centímetros.
*/
import java.util.Scanner;
public class Rev004
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	double converter=0;

		System.out.println("Insira um numero em metros para converter para centimetros: ");
		double numero = scanner.nextDouble();

		
	    converter = numero *100;
		System.out.println("A conversaos sera: "+converter+"cm");
		
		
	}
}