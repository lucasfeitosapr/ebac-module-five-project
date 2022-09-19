package br.com.lucasfeitosa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        float firstGrade = scanner.nextFloat();

        System.out.println("Insira a segunda nota: ");
        float secondGrade = scanner.nextFloat();

        System.out.println("Insira a terceira nota: ");
        float thirdGrade = scanner.nextFloat();

        System.out.println("Insira a quarta nota: ");
        float fourthGrade = scanner.nextFloat();

        System.out.println("A média é: " + (firstGrade + secondGrade + thirdGrade + fourthGrade) / 4);
    }
}
