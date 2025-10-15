package ch13.enums;

public class OverTimeManager3 {
    public static void main(String[] args) {
        OverTimeValues2[] values = OverTimeValues2.values();
        for (OverTimeValues2 value : values) {
            System.out.println(value);
        }
    }
}
