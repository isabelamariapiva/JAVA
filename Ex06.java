/*
Ex06 identificar se o numero é impar ou par

*/
import java.util.Scanner;
public class Ex06{
    public static void main(String[] args) {
     //ler a entrada do teclado
    Scanner scanner = new Scanner(System.in);
       
    System.out.print("insira um numero: ");
    double numero=scanner.nextDouble();
    

    if (numero % 2 ==0 ){
    System.out.println(" Numero par");
  
    
    } else {
    System.out.println("Numero impar");
   
     }
     //saida
     scanner.close();
    }
 
 }
 
