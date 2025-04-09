/*
Ex42- Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.
*/
import java.util.Scanner;
public class Ex42
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

 double precoPequeno = 10;
 double precoMedio = 12;
 double precoGrande = 15;

System.out.print("Digite a quantidade de camisetas pequenas: ");
int quantidadePequeno = scanner.nextInt();

System.out.print("Digite a quantidade de camisetas medias: ");
int quantidadeMedio = scanner.nextInt();
       
System.out.print("Digite a quantidade de camisetas grandes: ");
int quantidadeGrande = scanner.nextInt();

double total;
total = (quantidadePequeno*10) + (quantidadeMedio*12) + (quantidadeGrande*15);

System.out.print("Sera arrecadado: R$"+ total);
 }
}