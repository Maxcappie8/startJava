package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        do {
            System.out.print("Введите первое число: ");
            calc.setFirstNumder(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setOperation(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setSecondNumder(scanner.nextInt());
            System.out.println("Результат: " + calc.calculate());
        } while (validateUserResponse());
    }

    private static boolean validateUserResponse() {
        System.out.print("Хотите продолжить? [да/нет]: ");
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("да")) {
            return true;
        } else if (userResponse.equalsIgnoreCase("нет")) {
            return false;
        } else {
            return validateUserResponse();
        }
    }
}