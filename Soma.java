/******************************************************************************

 Calcule a soma dos dois numeros 

*******************************************************************************/
import java.util.Scanner;
public class Soma
{
	public static void main(String[] args) {
		//declarar variavel
		double a, b,Soma;
		Scanner ler = new Scanner (System.in);
	    System.out.println("Digite o primeiro numero");
		a = ler.nextDouble();
		System.out.println("Digite o segundo numero");
		b = ler.nextDouble();
		
		//processamento
		Soma = a + b;
		
		//saida
		System.out.println("O resultado sera: " + Soma);
	}
}