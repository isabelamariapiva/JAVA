/******************************************************************************
Rev022
Crie um vetor de 5 números inteiros, preencha com valores de sua escolha 
e calcule a soma de todos os elementos desse vetor. Exiba o resultado.
*******************************************************************************/
import java.util.Scanner;
public class Rev022
{
	public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int soma=0;
    int [] numero = new int [4];

    
    for( int i =0; i < numero.length; i++){
        System.out.print("\nInsira o "+(i+1)+"° numero: ");
        numero [i] = scanner.nextInt();
        soma += numero[i];
       System.out.print("\nA soma dos numeros será: "+soma);
    }
	}
}