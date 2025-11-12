package org.example.assumptions;

import org.example.BancoDeDados;
import org.example.Conta;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

class AssumptionsTest {

    @BeforeAll
    static void setup() {
        System.out.println("Inicializando conexão com o banco de dados...");
        BancoDeDados.conectar();
    }

    @Test
    void deveExecutarSomenteSeBancoConectado() {
        BancoDeDados.conectar(); // garante que está conectado
        assumeTrue(BancoDeDados.isConectado(), "Banco de dados não está conectado, teste ignorado.");
        assertTrue(BancoDeDados.isConectado());
    }


    @Test
    void deveIgnorarSeBancoDesconectado() {
        BancoDeDados.desconectar();

        assumeTrue(BancoDeDados.isConectado(), "Banco desconectado — teste será ignorado.");

        // Este trecho não deve rodar se a assumption falhar
        Conta conta = new Conta("Roberto", 200.0);
        conta.sacar(50.0);

        assertEquals(150.0, conta.getSaldo());
        System.out.println("Este print não deve aparecer, pois o teste será ignorado.");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "DEV")
    void deveExecutarSomenteEmAmbienteDeDesenvolvimento() {
        System.out.println("🚀 Este teste só roda se a variável de ambiente ENV = DEV");
        assertTrue(true);
    }
}
