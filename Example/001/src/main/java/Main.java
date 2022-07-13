import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String s1 = "A" + ('\t' + '\u0003');
//        String s2 = "A" + 12;
//        String s3 = 'A' + "12";
//        String s4 = 'A' + '1' + "2";
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);

        //System.out.println(isPalindrome("Madam, I'm Adam!"));

        System.out.println(factorial(3));

    }

    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
//        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
//        Matcher matcher = pattern.matcher(text);
//
//        while (matcher.find()) {
//            int start = matcher.start();
//            int end = matcher.end();
//            text = text.replaceAll(text.substring(start, end), " ");
//            //System.out.println("Найдено совпадение " + text.substring(start, end) + " с "+ start + " по " + (end - 1) + " позицию");
//        }
//        text = text.replaceAll(" ", "").toLowerCase();
//        StringBuilder sb = new StringBuilder(text);
//        String textRev = sb.reverse().toString();
//
//        return text.equals(textRev);
        String newString = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sbNewString = new StringBuilder(newString);
        return newString.equalsIgnoreCase(sbNewString.reverse().toString());
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger bi = new BigInteger(String.valueOf(value));
        for (int i = 1; i < value; i++) {
            BigInteger j = new BigInteger(String.valueOf(i));
            bi = bi.multiply(j);
        }
        return bi;
    }
}
