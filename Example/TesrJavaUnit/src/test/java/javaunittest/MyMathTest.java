package javaunittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}