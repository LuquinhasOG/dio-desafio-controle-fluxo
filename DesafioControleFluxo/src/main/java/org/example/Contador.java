package org.example;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm, parametroDois;

        System.out.println("Digite o primeiro parâmetro");
        parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (InvalidParameterException exception) {
            System.out.println(exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws InvalidParameterException {
        if (parametroUm > parametroDois) {
            throw new InvalidParameterException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
