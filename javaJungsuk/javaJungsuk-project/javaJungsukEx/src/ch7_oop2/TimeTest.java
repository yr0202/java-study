package ch7_oop2;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();

        t.setHour(23);
        t.setMinute(56);
        t.setSecond(12);

        System.out.println("hour = " + t.getHour());
        t.setHour(25);
        System.out.println("t.getHour() = " + t.getHour());
    }
}
