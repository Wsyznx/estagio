# Dados em sequencia fibonacci:

import java.util.Scanner;

public class FibonacciCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (pertenceAFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceAFibonacci(int num) {
        int a = 0;
        int b = 1;

        while (a < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        return a == num;
    }
}
