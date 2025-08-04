Ex01
import java.util.Scanner;
public class Ex01 {

    public static void main (String []args) {
        Scanner ler =new Scanner(System.in);
        int a, b;

        System.out.print ("Informe o primeiro valor: ");
        a = ler.nextInt();

        System.out.print ("Informe o segundo valor: ");
        b = ler.nextInt();

        System.out.println("Resultados");
        System.out.println("Soma: "+(a + b));
        System.out.println("Subtração: "+(a - b));
        System.out.println("Multiplicação: "+(a * b));
        System.out.println("Divisão inteira : "+(a % b));
        System.out.println("Divisão exata: "+((double) a / b));




    }
}


Ex02
import java.util.Scanner;
public class Ex02 {

    public static void main (String []args) {
        Scanner ler =new Scanner(System.in);
        int num1, num2, num3;

        System.out.print ("Informe o primeiro numero : ");
        num1 = ler.nextInt();

        System.out.print ("Informe o segundo numero: ");
        num2 = ler.nextInt();

        System.out.print ("Informe o terceiro numero: ");
        num3 = ler.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.print ("O primeiro numero é maior ");
        } else if (num2 > num3 && num3 <num1) {
            System.out.print("o segundo numero é maior  ");
        } else {
            System.out.print ("O terceiro numero é o maior  ");
        }
        }


}


Ex03
import java.util.Scanner;
public class Ex03 {

    public static void main (String []args) {
        Scanner ler =new Scanner(System.in);

        System.out.print("escolha u numero de 1 a 3: ");
        int num = ler.nextInt();

        switch (num) {
            case 1:
                System.out.print("O numero escolhido foi 1.");
                break;
            case 2:
                System.out.print("O numero escolhido foi 2.");
                break;
            case 3 :
                System.out.print("O numero escolhido foi 3.");
                break;
            default:
                System.out.print("O numero escolhido é invalido! Digite um numero de 1 a 3. ");
        }

        }
}


Ex04
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.print("informe o intervalo de numero : ");
         n = ler.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("Numero" + i);
            }
        }
        ler.close();
    }
}


Ex05
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nomes[] = new String [5];

        for(int i = 0; i <5; i++) {
            System.out.print("Informe o" + i + "° Nome..: ");
            nomes[i] = ler.next();
        }
        for(int i = 0; i<5; i++) {
            System.out.println("Os nomes são: " + nomes[i]);
        }
        ler.close();
    }
}


EX06
import java.util.Scanner;
public class Ex06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int soma = 0;
        int v[] =new int [10];

        for(int i=0; i<10; i++) {
            System.out.println("Informe o " + i + "° valor..: ");
            v[i] = ler.nextInt();
            soma = soma + v[i];
        }
        if(soma>15) {
            System.out.println("a soma dos valores do vetor é " + soma);
        } else {
            System.out.println("A soma dos valores é menor que 10" );
        }
        ler.close();
        }
}


Ex07
import java.util.ArrayList;
import java.util.Scanner;
public class Ex07 {


    public static void main (String []args) {
        ArrayList<String> carros = new ArrayList <String>();
                carros.add("fusca");
                carros.add("gol");
                carros.add("chevette");
                carros.add("spin");
                carros.add("camaro");


    }

}


Ex08
import java.util.ArrayList;
import java.util.Arrays;
public class Ex08 {
    public static void main(String[] args) {
        String[] disciplinas = {"matematica", "filosofia", "historia", "fisica"};
        ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
        novaLista.add("geografia");
        novaLista.add("lingua inglesa");

        for (String i : novaLista) {
            System.out.print("disciplina: " + i);
        }
    }
}



Ex09
import java.util.ArrayList;
public class Ex09 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);

        System.out.println(numeros.get(0));
        System.out.println(numeros.get(1));

        numeros.set(1, 25);
        System.out.println(numeros.get(1));

        numeros.remove(0);
        System.out.println(numeros.get(0));

        System.out.println(numeros.size());
    }
    }



Ex10
import java.util.ArrayList;
import java.util.Random;
public class Ex10 {
    public static void main (String []args) {

        ArrayList<Integer> numeros =new ArrayList<>();

        Random random =new Random();

        for (int i =0; i < 5; i++ ) {
            int numeroAleatorio = random.nextInt(100);
            numeros.add(numeroAleatorio);
        }
        for (int numero : numeros ) {
            System.out.println(numero);
        }
    }
}


Ex11
import java.util.ArrayList;
import java.util.List;
public class Ex11 {
    public static void main (String []args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i= 1; i <=10; i ++) {
            numeros.add(i);
        }
          if  (numeros.size()> 4) {
              numeros.remove(4);
          }
          System.out.println("Lista final: "+numeros);

    }
}







