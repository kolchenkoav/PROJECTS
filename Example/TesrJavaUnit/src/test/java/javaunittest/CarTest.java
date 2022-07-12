package javaunittest;

//import com.sun.jdi.Method;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    public Car car;

    @BeforeEach
    public void createCar() {
        car = new Car("Skoda", "ABC-1234", 2019, "Aleksey");
    }

    @Test
    void getManufactorer() {
        assertEquals("Skoda", car.getManufactorer());
    }

    @Test
    void getNumber() {
        assertEquals("ABC-1234", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("xxx-077");
        assertEquals("xxx-077", car.getNumber());
    }

    @Test
    void getYear() {
        assertEquals(2019, car.getYear());
    }

    @Test
    void getOwher() {
        assertEquals("Aleksey", car.getOwher());
    }

    @Test
    void setOwher() {
        car.setOwher("Kolchenko");
        assertEquals("Kolchenko", car.getOwher());
    }

    @Test
    /**
     * test only after constructor
     */
    void getListOfOwners() {
        assertArrayEquals(new String[]{"Aleksey"}, car.getOwners().toArray());
    }

    @Test
    /**
     * test for situation after setOwner
     */
    void getListOfTwoOwners() {
        car.setOwher("Marina");
        assertArrayEquals(new String[]{"Aleksey", "Marina"}, car.getOwners().toArray());
    }

    /**
     *
     * public class Car {
     *    private String testMethod() {
     *         return "ABS";
     *    }
     * }
     *
     */
    @Test
    void testPrivateMethod() {
        try {
            // import java.lang.reflect.Method;
            //                                                             if method has parameters ex.(String s) then String.class, else null
            Method method = Car.class.getDeclaredMethod("testMethod", null);
            method.setAccessible(true);
            assertEquals("ABS", method.invoke(car).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * public class Car {
     *    private String testMethod(String a) {
     *         return a;
     *    }
     * }
     */
    @Test
    void testPrivateMethodWithArg() {
        try {
            // import java.lang.reflect.Method;
            //                                                             if method has parameters ex.(String s) then String.class, else null
            Method method = Car.class.getDeclaredMethod("testMethod", String.class);
            method.setAccessible(true);
            assertEquals("dsa", method.invoke(car, "dsa").toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}