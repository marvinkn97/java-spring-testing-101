package dev.marvin;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math operation in Calculator class")
class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void setup() {
        System.out.println("Executing @BeforeAll method");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Executing @AfterAll method");
    }

    @BeforeEach
    void beforeEachTestMethod() {
        System.out.println("Executing @BeforeEach method.");
        calculator = new Calculator();
    }

    @AfterEach
    void afterEachTestMethod() {
        System.out.println("Executing @AfterEach method.");
    }

    @DisplayName("Test 4 divided by 2")
    @Test
    void testIntegerDivision_whenFourIsDividedByTwo_ShouldReturnTwo() {
        //when
        int actual = calculator.integerDivision(4, 2);

        //then
        assertEquals(2, actual, "4/2 did not produce 2");
    }

    @DisplayName("Test division by zero")
    @Test
    void testIntegerDivision_WhenFourIsDividedByZero_ShouldThrowArithmeticException() {
        System.out.println("Running Division by zero");
        String expectedExceptionMessage = "/ by zero";

        ArithmeticException actualException = assertThrows(ArithmeticException.class, () -> calculator.integerDivision(4, 0), "Should have thrown an Arithmetic Exception");
        assertEquals(expectedExceptionMessage, actualException.getMessage(), "Unexpected exception message");

    }

    @DisplayName("Test 4 minus 2")
    @Test
    void integerSubtraction() {
        //when
        int actual = calculator.integerSubtraction(4, 2);

        //then
        assertEquals(2, actual, "4-2 did not produce 2");
    }
}