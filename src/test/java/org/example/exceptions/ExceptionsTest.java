package org.example.exceptions;

import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionsTest {

    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        Calculadora calc = new Calculadora();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10, 0);
        });

        assertEquals("Divisão por zero não é permitida!", exception.getMessage());
    }

    @Test
    void naoDeveLancarExcecaoQuandoDivisaoValida() {
        Calculadora calc = new Calculadora();

        assertDoesNotThrow(() -> calc.dividir(10, 2));
    }
}
