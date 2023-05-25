package core;

public class TestCOR {
    public static void main(String[] args) {
        try {
            DateTime dataTime = new DateTime.Builder().withYear(2000)
                    .withMonth(7)
                    .withDay(-1)
                    .withHour(10)
                    .withMinute(10)
                    .withSeconds(10)
                    .build();
            Chain testChain = new Chain();
            testChain.process(dataTime);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        // assertExceptionThrown();
    }


}
