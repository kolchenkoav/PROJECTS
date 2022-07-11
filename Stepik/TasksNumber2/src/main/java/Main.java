public class Main {
    private static double deviation = 0.0001;

    public static void main(String[] args) {
        //double hex = 0x0bp3;
        //System.out.println(doubleExpression(0.1, 0.2, 0.3));
        //System.out.println(hex);
        System.out.println(flipBit(0, 1));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < deviation;
    }

    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex-1); // put your implementation here
    }
}
