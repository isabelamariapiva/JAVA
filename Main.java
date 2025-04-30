/*
Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
*/
import java.util.Scanner;
public class Rev001
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		double numero = scanner.nextDouble();
		
		System.out.println("O numero informado é "+numero);
		
	}
}