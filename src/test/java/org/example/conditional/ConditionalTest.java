
package org.example.conditional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConditionalTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "DEV")
    void deveExecutarSomenteEmAmbienteDev() {
        System.out.println("Executando teste em ambiente DEV ✅");
        assertTrue(true);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "ENV", matches = "PROD")
    void deveIgnorarEmAmbienteProd() {
        System.out.println("Ignorado em ambiente PROD ⚠️");
        assertTrue(true);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void deveExecutarSomenteNoWindows() {
        System.out.println("Executando no Windows 🪟");
        assertTrue(System.getProperty("os.name").toLowerCase().contains("windows"));
    }
}