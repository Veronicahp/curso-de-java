
import java.util.Scanner;


public class Exercicio15 {

    public static void main(String[] args) {

        int numero;

        System.out.println("Digite um valor");

        Scanner leitorScanner = new Scanner(System.in);

        numero = leitorScanner.nextInt();

        leitorScanner.close();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo");
        } else {
            System.out.println("O número não está no intervalo");
        }
    }
}
