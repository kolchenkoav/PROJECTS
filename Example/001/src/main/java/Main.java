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

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int fooLength = a1.length;
        int barLength = a2.length;

        int[] merged = new int[fooLength + barLength];

        int fooPosition, barPosition, mergedPosition;
        fooPosition = barPosition = mergedPosition = 0;

        while(fooPosition < fooLength && barPosition < barLength) {
            if (a1[fooPosition] < a2[barPosition]) {
                merged[mergedPosition++] = a1[fooPosition++];
            } else {
                merged[mergedPosition++] = a2[barPosition++];
            }
        }

        while (fooPosition < fooLength) {
            merged[mergedPosition++] = a1[fooPosition++];
        }

        while (barPosition < barLength) {
            merged[mergedPosition++] = a2[barPosition++];
        }

        return merged;
    }
    /*
    Step 1:

We start by comparing the elements in both the arrays, and we pick the smaller one.

Merge Arrays First Step
Then we increment the position in the first array.

Step 2:

Merge Arrays Second Step
Here we increment the position in the second array and move on to the next element which is 8.

Step 3:
Merge Arrays Third Step

At the end of this iteration, we've traversed all the elements of the first array.

Step 4:

In this step, we just copy all the remaining elements from the second array to result.

Merge Arrays Fourth Step
     */
}
