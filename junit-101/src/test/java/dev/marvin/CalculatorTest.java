package dev.marvin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void integerDivision() {
        //given
        Calculator calculator = new Calculator();

        //when
        int actual = calculator.integerDivision(4, 2);

        //then
        assertEquals(2, actual, "4/2 did not produce 2");
    }
}