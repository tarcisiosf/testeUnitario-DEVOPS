package test;

import br.com.aula.ConversorTemperatura;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTemperaturaTest {

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @Test
    void testCelsiusParaFahrenheit() {
        assertEquals(50.0, conversor.celsiusParaFahrenheit(10.0), 0.001);
    }

    @Test
    void testCelsiusParaFahrenheit_CasoBordaZero() {
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0.0), 0.001);
    }

    @Test
    void testFahrenheitParaCelsius() {
        assertEquals(10.0, conversor.fahrenheitParaCelsius(50.0), 0.001);
    }

    @Test
    void testFahrenheitParaCelsius_CasoBordaNegativo() {
        assertEquals(-15, conversor.fahrenheitParaCelsius(5.0), 0.001);
    }
}