import java.util.Scanner;

public class Fibonacci {
    /*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
    (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
    ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.*/
    public static void main(ContarLetraA[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para verificarmos se pertence à sequência Fibonacci:");
        long i = sc.nextLong();
        int a = 0, b = 1, c = 0;
        while (c <= i) {
            c = a + b;
            a = b;
            b = c;
        }
        if (i==a) {
            System.out.print(i + " pertence à sequência de Fibonacci");
        } else {
            System.out.print(i + " não pertence à sequência de Fibonacci, ele está entre ("+ a +") e ("+c+"), esses dois pertencem à sequência.");
        }
    }
}

