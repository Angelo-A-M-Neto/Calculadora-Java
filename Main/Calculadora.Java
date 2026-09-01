import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Multiplicação: " + (n1 * n2));

           

        sc.close();
    }
}