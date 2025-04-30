/*
Ex revisão 02
Faça um Programa que peça dois números e imprima a soma.
*/
import java.util.Scanner;
public class Rev002
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    int soma =0;
	    
	    for (int i =0; i<2; i++ ){
		System.out.println("Digite um numero: ");
		double numero = scanner.nextDouble();
		 soma += numero;
	    }
	   
		System.out.println("A soma dos dois numeros é "+soma);
		
	}
}
