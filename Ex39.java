/*
Ex39-  ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
ela possui
*/
import java.util.Scanner;
public class Ex37
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite o nome: ");
String nome = scanner.nextLine();

System.out.print("Digite a idade: ");
int idade = scanner.nextInt();

int dias = (idade*365);
System.out.println(nome+" voce ja viveu "+ dias);
  }
}    