package ru.mirea.ikbo2822.ulyanov.lab20;

import java.util.Stack;
public class CalculatorModel {
    public double evaluateRPN(String[] tokens) {
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    System.out.println("Невозможно выполнить операцию. Недостаточно операндов в стеке.");
                    return Double.NaN; // Возвращаем NaN, чтобы указать на ошибку
                }

                double operand2 = stack.pop();
                double operand1 = stack.pop();

                double result = performOperation(token, operand1, operand2);
                stack.push(result);
            } else {
                System.out.println("Некорректный токен: " + token);
                return Double.NaN; // Возвращаем NaN, чтобы указать на ошибку
            }
        }

        if (stack.size() == 1) {
            return stack.pop();
        } else {
            System.out.println("Некорректное выражение. Остались не применённые операнды или операторы в стеке.");
            return Double.NaN; // Возвращаем NaN, чтобы указать на ошибку
        }
    }
    private double performOperation(String operator,double operand1, double operand2){
        switch (operator) {
            case "+" -> {
                return operand1 + operand2;
            }
            case "-" -> {
                return operand1 - operand2;
            }
            case "*" -> {
                return operand1 * operand2;
            }
            case "/" -> {
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    private boolean isNumber(String token) {
        return token.matches("\\d+(\\.\\d+)?");
    }

    private boolean isOperator(String token) {
        return token.matches("[+\\-*/]");
    }
}
