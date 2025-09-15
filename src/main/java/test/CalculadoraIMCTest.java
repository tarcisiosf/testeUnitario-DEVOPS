package test;

import br.com.aula.CalculadoraIMC;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculadoraIMCTest {

    private final CalculadoraIMC calculadora = new CalculadoraIMC();

    @Test
    void testClassificarAbaixoDoPeso() {
        assertEquals("Abaixo do peso", calculadora.classificar(18.4));
    }

    @Test
    void testClassificarNormal() {
        assertEquals("Normal", calculadora.classificar(18.5));
        assertEquals("Normal", calculadora.classificar(22.0));
    }

    @Test
    void testClassificarSobrepeso() {
        assertEquals("Sobrepeso", calculadora.classificar(25.0));
        assertEquals("Sobrepeso", calculadora.classificar(29.9));
    }

    @Test
    void testClassificarObesidade() {
        assertEquals("Obesidade", calculadora.classificar(30.0));
    }

    @Test
    void testCalculoComAlturaZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcular(70, 0);
        });
    }
}