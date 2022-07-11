import static java.lang.Integer.bitCount;

public class Main {
    public static void main(String[] args) {

        long fromString = Long.parseLong("123456");
        int fromInteger = Integer.parseInt("4321");
        double fromDouble = Double.parseDouble("123.45678");
        System.out.println(fromString + " "+fromInteger+" "+fromDouble);

        String s1 = Long.toString(123456);
        String s2 = Integer.toString(4321);
        String s3 = Double.toString(123.45678);

        System.out.println("String: " + s1 + " " + s2 + " " +s3);

        System.out.println(bitCount(2));

        //ShowBits showBits = new ShowBits(9);
        //showBits.show(256);
        //System.out.println(Integer.toBinaryString(256));
        System.out.println(isPowerOfTwo(-256));

        System.out.println(charExpression(32));
    }
    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }

    public static char charExpression(int a) {
//        1. Объявите константу char charValue = '\\';
//
//        2. Преобразуйте charValue к int
//
//        3.  сложите charValue + a
//
//        4. a преобразовать к char
//
//        5. в return отдать переменную с результатом
        //int i = (int) '\\' + a;
        return  (char) ((int) '\\' + a);                      //'?' - 1;
    }

}
