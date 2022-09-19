package br.com.lucasfeitosa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um inteiro: ");
        int valor = scanner.nextInt();

        Wrapper wrapper = new Wrapper();

        wrapper.setIntPrimitivo(valor);

        Integer wrapperValue = wrapper.convertPrimitiveInToWrapper(valor);

        wrapper.setIntWrapper(wrapperValue);

        System.out.println("O valor convertido para Integer é: "+ wrapper.getIntWrapper());
    }
}
