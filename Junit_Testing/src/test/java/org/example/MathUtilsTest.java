package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    //nested test class
    @Nested
    class AddTest{
        @Test
        @DisplayName("Test Addition for + numbers")
        void addTestPositiveNumber() {
            assumeTrue(true);
            int expected = 22;

            int actual = mathUtils.add(21, 1);
            assertEquals(expected, actual, "This add method add two numbers");
        }

        @Test
        @DisplayName("Test Addition for - numbers")
        void addTestNegativeNumber() {
            assumeTrue(true);
            int expected = -2;

            int actual = mathUtils.add(-1, -1);
            assertEquals(expected, actual, "This add method add two numbers");
        }
    }



    @Test
    void subTest() {
        int expected = 1;
        MathUtils mathUtils = new MathUtils();
        int actual = mathUtils.subtraction(2, 1);
        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0));
    }

    @Test
    void division() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(1, mathUtils.divide(1, 1));
    }

    @Test
    void multiplication() {
        assertAll(
                () -> assertEquals(1, mathUtils.multiplication(1, 1)),
                () -> assertEquals(4, mathUtils.multiplication(2, 2)),
                () -> assertEquals(6, mathUtils.multiplication(3, 2))
        );
    }

    @BeforeAll
    static void beforeAllMessage() {
        System.out.println("--MathUtil test class--");
    }

}