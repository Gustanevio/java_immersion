package enumeration;

public class TestEnumeration {

    public static void main(String[] args) {
        System.out.println("Day 1 " + Days.MONDAY);
        weekDay(Days.MONDAY);
    }

    private static void weekDay(Days day) {
        switch (day) {
            case MONDAY:
                System.out.println("First day of the week");
                break;
            case TUESDAY:
                System.out.println("Second day of the week");
                break;
            default:
                throw new AssertionError();
        }
    }
}
