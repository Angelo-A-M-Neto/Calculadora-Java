import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Subtração: " + (n1 - n2)); 
        if (n2 != 0) {
            System.out.println("Divisão: " + (n1 / n2)); } 
        else {
            System.out.println("Divisão: não é possível dividir por zero."); }

        sc.close();
    }
}