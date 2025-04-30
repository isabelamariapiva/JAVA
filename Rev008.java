/*
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo 
(50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá 
pagar. Imprima os dados do programa com as mensagens adequadas.
*/
import java.util.Scanner;
public class Rev008
{
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double Total;
    double Multa;

    System.out.print("\nO preço do Kg é de R$35.\nInsira o peso do peixe: ");
    double PesoPeixe = ler.nextDouble();
    Total = PesoPeixe * 35;
    
    if (PesoPeixe >50 ){
    Multa = (PesoPeixe - 50) * 4;
    System.out.println("\nO valor da multa é: R$"+Multa+"\nO valor a ser pago será: "+(Multa+Total));
    }else{
    System.out.println("O valor total será: R$"+Total);
    }
}
}
	