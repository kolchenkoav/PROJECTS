import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

    @Test
    void isPalindrome() {
    }

    @ParameterizedTest
    @CsvSource({    "1, 1",
            "3, 6",
            "4, 24"})
    void factorialTest(int value, BigInteger output) {
        assertEquals(Main.factorial(value), output);
    }
}