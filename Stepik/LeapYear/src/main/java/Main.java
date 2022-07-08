public class Main {
    public static void main(String[] args) {
        System.out.println(leapYearCount(2022));
    }

    public static int leapYearCount(int year) {
        return year/400 + year/4 - year/100;
                //(year - (year % 4)) / 4 - ((year - (year % 100)) / 100 - (year - (year % 400)) / 400);
    }
}
