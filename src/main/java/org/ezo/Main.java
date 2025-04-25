package org.ezo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Mini Calculatrice (code golf) === ");
        while (true) {
            System.out.println("Entrez une expression : >");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            System.out.println("= " + calculator.calculate(input));
        }


    }
}