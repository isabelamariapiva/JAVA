/*
Rev14
As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram 
para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, 
baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante :
aumento de 5% Após o aumento ser realizado,
informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
*/
import java.util.Scanner;
public class Rev14 {
public  static void main (String[]args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("insira o salario: ");
    double salario = scanner.nextDouble();
    double Calculo1;
    double Calculo2;
    double Calculo3;
    double Calculo4;
    
    if (salario<=280){
    Calculo1= salario*0.20;
     System.out.print("O salario apos o aumento é: "+Calculo1+"\nO percentual de aumento aplicado è de 20%"+"\nO  valor do aumento será: "+(salario-Calculo1));
    }else if (salario>=280 && salario<=700){
    Calculo2= salario*0.15;
    System.out.print("O salario apos o aumento é: "+Calculo2+"O percentual de aumento aplicado è de 15%"+"O  valor do aumento será: "+(salario-Calculo2));
    }else if (salario>=700 && salario<=1500){
    Calculo3= salario*0.10;
    System.out.println("O salario apos o aumento é: "+Calculo3+"O percentual de aumento aplicado è de 20%"+"O  valor do aumento será: "+(salario-Calculo3));
    }else {
    Calculo4= salario*0.5;
    System.out.println("O salario apos o aumento é: "+Calculo4+"O percentual de aumento aplicado è de 20%"+"O  valor do aumento será: "+(salario-Calculo4));
    
    }
}
}
  