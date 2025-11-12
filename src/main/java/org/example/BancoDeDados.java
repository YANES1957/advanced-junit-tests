package org.example;

public class BancoDeDados {
    private static boolean conectado = false;

    public static void conectar() {
        conectado = true;
        System.out.println("Conectado ao banco!");
    }

    public static void desconectar() {
        conectado = false;
        System.out.println("Desconectado do banco!");
    }

    public static boolean isConectado() {
        return conectado;
    }
}
