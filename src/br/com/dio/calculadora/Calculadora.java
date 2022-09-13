package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;

        System.out.println("digite o primeiro valor : ");
        a = scan.nextInt();
        System.out.println("digite o segundo valor : ");
        b = scan.nextInt();

        int soma = somar(a, b);
        int subtracao = subtrair(a, b);
        int multiplicacao = multiplicar(a, b);
        int divisao = dividir(a, b);

        System.out.println("somar: " + soma);
        System.out.println("subtracao: " + subtracao);
        System.out.println("multiplicacao: " + multiplicacao);
        System.out.println("divisao: " + divisao);
    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int dividir(int a, int b){
        return a / b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
}
