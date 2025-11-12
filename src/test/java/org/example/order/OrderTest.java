package org.example.order;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderTest {

    private static int contador = 0;

    @Test
    @Order(1)
    void testeA_inicializaContador() {
        contador = 1;
        System.out.println("Teste A executado 🚀");
        assertEquals(1, contador);
    }

    @Test
    @Order(2)
    void testeB_incrementaContador() {
        contador++;
        System.out.println("Teste B executado ⚙️");
        assertEquals(2, contador);
    }

    @Test
    @Order(3)
    void testeC_verificaValorFinal() {
        System.out.println("Teste C executado 🧩");
        assertEquals(2, contador);
    }
}
