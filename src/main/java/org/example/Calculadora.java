package org.example;

public class Calculadora {

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida!");
        }
        return a / b;
    }
}
