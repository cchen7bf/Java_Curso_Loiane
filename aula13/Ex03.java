/*
Faça um programa que peça dois números e imprima a soma
*/

import java.util.Scanner;

public class Ex03
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scan.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma é: " +soma);
    }

}


