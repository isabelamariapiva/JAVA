/******************************************************************************
Crie um vetor de 10 inteiros e inicialize-o com valores sequenciais (1, 2, 3, ..., 10).
Em seguida, imprima todos os valores do vetor na tela.
*******************************************************************************/
import java.util.Scanner;
public class Rev021
{
	public static void main(String[] args) {
    Scanner scanner= new Scanner (System.in);
    
    int [] numero = {1,2,3,4,5,6,7,8,9,10};
    
    for( int i =0; i <10; i++){
        System.out.print("\n"+ numero[i]);
    }
	}
}