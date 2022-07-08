import java.util.ArrayList;
import java.util.Arrays;

public class BuslavskiiVersionOfStepikOrgTaskResultCheck {
    public static void main(String[] args) throws Exception {

        boolean ffff = booleanExpression(false, false, false, false);
        boolean ffft = booleanExpression(false, false, false, true);
        boolean fftf = booleanExpression(false, false, true, false);
        boolean fftt  = booleanExpression(false, false, true, true); //Searching for this

        boolean ftff = booleanExpression(false, true, false, false);
        boolean ftft = booleanExpression(false, true, false, true); //Searching for this
        boolean fttf = booleanExpression(false, true, true, false); //Searching for this
        boolean fttt = booleanExpression(false, true, true, true);

        boolean tfff = booleanExpression(true, false, false, false);
        boolean tfft = booleanExpression(true, false, false, true); //Searching for this
        boolean tftf = booleanExpression(true, false, true, false); //Searching for this
        boolean tftt = booleanExpression(true, false, true, true);

        boolean ttff = booleanExpression(true, true, false, false); //Searching for this
        boolean ttft = booleanExpression(true, true, false, true);
        boolean tttf = booleanExpression(true, true, true, false);
        boolean tttt = booleanExpression(true, true, true, true);

        System.out.println("ffff " + ffff);
        System.out.println("ffft " + ffft);
        System.out.println("fftf " + fftf);
        System.out.println("fftt " + fftt + " <- ");

        System.out.println("ftff " + ftff);
        System.out.println("ftft " + ftft + " <- ");
        System.out.println("fttf " + fttf + " <- ");
        System.out.println("fttt " + fttt);

        System.out.println("tfff " + tfff);
        System.out.println("tfft " + tfft + " <- ");
        System.out.println("tftf " + tftf + " <- ");
        System.out.println("tftt " + tftt);

        System.out.println("ttff " + ttff + " <- ");
        System.out.println("ttft " + ttft);
        System.out.println("tttf " + tttf);
        System.out.println("tttt " + tttt);


        boolean allCorrectAreTrue = fftt & ftft & fttf & tfft & tftf & ttff;

        boolean allIncorrectAreTrue = ffff | ffft | fftf | ftff | fttt |  tfff | tftt | ttft | tttf | tttt;

        boolean correctAnswerCondition = allCorrectAreTrue & !allIncorrectAreTrue;

        if (correctAnswerCondition) {
            System.out.println(" You have found the correct answer!!! :) ");
        } else {
            System.out.println(" Correct answer still to be found... :( ");
        }


    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        /*
        Ваш код решения заключается в изменении того, что будете возвращать! Изменяйте возвращаемое значение
        до тех пор, пока метод выше не поздравит Вас с корректно найденным сочетанием.
        ВАЖНО!!!
        В моём примере после return - НЕПРАВИЛЬНЫЙ вариант! Ищите свой, правильный :)
        */

//        int countTrue = 0;
//        countTrue = countTrue + (a ? 1 : 0);
//        countTrue = countTrue + (b ? 1 : 0);
//        countTrue = countTrue + (c ? 1 : 0);
//        countTrue = countTrue + (d ? 1 : 0);
//        return (countTrue == 2);

        return new ArrayList<>(Arrays.asList(a, b, c, d))
                .stream().filter(x -> x == true).count() == 2;
    }
}