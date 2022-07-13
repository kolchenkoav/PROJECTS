package javaunittest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

//    @BeforeAll
//    static void prepareAll() {
//        System.out.println("prepare global ...");
//    }
//
//    @BeforeEach
//    void prepareMethods() {
//        System.out.println("prepare methods ...");
//    }
//
//    @AfterEach
//    void exitMethods() {
//        System.out.println("exit methods ...");
//    }

    @Test
    void add() {
        assertEquals(MyMath.add(12, 8), 20);
    }

    @Test
    void div() {
        assertEquals(MyMath.div(12, 3), 4);
    }

    @ParameterizedTest
    @ValueSource(strings = {"12"})
    //@NullSource
   // @EmptySource
    void addParam(int number) {
        assertEquals(MyMath.add(number, 8), 20);
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3",                             //    ( { " 'value1', 'value2', 'result' ", "..." } ) if String
               "12, 8, 20",
               "-40, -40, -80",
               "0, -123456789, -123456789"})
    void addParam(int value1, int value2, int result) {
        assertEquals(MyMath.add(value1, value2), result);
    }

    @ParameterizedTest
    @CsvSource({    "1, 5",
                    "10, 14",
                    "8, 12"})
    void testInt(int input, int otput) {
        assertEquals(MyMath.aPlus4( input ), otput);
    }

    @ParameterizedTest
    @DisplayName("Test     a div b = result   from file  \"/000.csv\"")
    @CsvFileSource(resources = "/000.csv", numLinesToSkip = 1)     // "/000.csv"
    public void testDiv(int value1, int value2, int result) {
        assertEquals(MyMath.div(value1, value2), result);
    }


}