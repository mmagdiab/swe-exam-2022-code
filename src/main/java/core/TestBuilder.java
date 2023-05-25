package core;

public class TestBuilder {
    public static void main(String[] args) {
        DateTime dataTime = new DateTime.Builder().withYear(2000)
                .withMonth(8)
                .withDay(14)
                .withHour(10)
                .withMinute(10)
                .withSeconds(10)
                .build();
    }
}
