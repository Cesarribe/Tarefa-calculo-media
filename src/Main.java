import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nota1, nota2, nota3, nota4;

        Scanner scanner = new Scanner(System.in);
        System.out.println("calculando a média ");

        System.out.println("qual a primeira nota?");
        nota1 = scanner.nextInt();
        System.out.println("qual a segunda nota?");
        nota2 = scanner.nextInt();
        System.out.println("qual a terceira nota?");
        nota3 = scanner.nextInt();
        System.out.println("qual a quarta nota?");
        nota4 = scanner.nextInt();
        System.out.println("gerando media");
        System.out.println("A media é: " + (nota1 + nota2 + nota3 + nota4)/4);
        // programa calcula a média entre quatro notas


    }
}