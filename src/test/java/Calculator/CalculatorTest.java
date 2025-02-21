import calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    void tset_jame_adad_calculator() {

        Calculator calculator = new Calculator();

        String haselJameAdad = calculator.add("5.3","-2");

        assertEquals("3.3",haselJameAdad);
    }
}