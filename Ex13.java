/*
Ex13- calculando e mostrando a sua área em m², alem de sua classificacao

*/
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar as medidas
        System.out.print("Digite a largura: ");
        int largura = scanner.nextInt();
        System.out.print("Digite o comprimento: ");
        int comprimento = scanner.nextInt();

        // Calcular a área
        int area = largura * comprimento;

        // Exibir a área
        System.out.println("A área será: " + area + "m²");

        // Classificar o terreno
        if (area < 100) {
            System.out.println("O terreno é popular");
        } else if (area >= 100 && area <= 500) {
            System.out.println("O terreno é master");
        } else {
            System.out.println("O terreno é VIP");
           
        }
}
}