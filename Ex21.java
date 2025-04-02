/*
Ex21
*/
import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int totalIdade = 0;
        double totalPeso = 0.0;
        double totalAltura = 0.0;
        int AzulOlhos = 0;
        int RuivoCabelo = 0; 
        int AlturaMenor = 0;

       
        for (int i = 1; i <= 20; i++) {
        System.out.println("Digite a idade da " + i + "° pessoa: ");
        int idade = ler.nextInt();
        totalIdade += idade;

        System.out.println("Digite o peso da " + i + "° pessoa: ");
        double peso = ler.nextDouble();
        totalPeso += peso;

        System.out.println("Digite a altura da " + i + "° pessoa: ");
        double altura = ler.nextDouble();
        totalAltura += altura;
        
        if (altura < 1.50) {
        AlturaMenor++;
}
        System.out.println("Digite a cor dos olhos: (A – Azul, P- Preto, V- Verde e C- Castanho)");
        char olhos = ler.next().charAt(0);

        System.out.println("Digite a cor do cabelo (P – Preto, C- Castanho, L – Louro e R-Ruivo)");
        char cabelo = ler.next().charAt(0);

           
            if (olhos == 'A' || olhos == 'a') {
              AzulOlhos++;
            }
            if (cabelo == 'R' || cabelo == 'r') {
                RuivoCabelo++;
            }
        }

        double mediaIdade = (double) totalIdade / 20;
        double mediaPeso = totalPeso / 20;
        double mediaAltura = totalAltura / 20;

        double porcentagemAzulOlhos = (double) AzulOlhos * 100 / 20;
        double porcentagemRuivoCabelo = (double) RuivoCabelo * 100 / 20;

        System.out.println("Média de Idade: " + mediaIdade);
        System.out.println("Média de Peso: " + mediaPeso);
        System.out.println("Média de Altura: " + mediaAltura);
        System.out.println("Porcentagem de pessoas com olhos azuis: " + porcentagemAzulOlhos + "%");
        System.out.println("Porcentagem de pessoas com cabelo ruivo: " + porcentagemRuivoCabelo + "%");
    
        if (porcentagemRuivoCabelo - porcentagemAzulOlhos > 5) {
            System.out.println("A diferença entre a porcentagem de pessoas com cabelo ruivo e olhos azuis é significativa!");
        }
          System.out.println("Número de pessoas com altura menor que 1.50 metros: " + AlturaMenor);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
