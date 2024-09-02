import java.util.Scanner;

public class ContarLetraA {
    /*Escreva um programa que verifique, em uma string, a existência da letra ‘a’,
     seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto para contarmos a quantidade de letras A's");
        String txt = sc.nextLine().toUpperCase();
        int count = 0;
        for (int i = 0; i <= txt.length() - 1; i++) {
            char a = txt.charAt(i);
            if (a == 'A') {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Não há letra A nesse texto");
        } else if (count == 1) {
            System.out.println("existem " + count + " letra A nesse texto");
        } else {
            System.out.println("existem " + count + " letras A's nesse texto");
        }
    }
}
