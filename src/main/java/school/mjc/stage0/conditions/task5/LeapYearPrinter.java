package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        System.out.println(year%400==0 && (year%100!=0 && year%4==0));
    }
}
