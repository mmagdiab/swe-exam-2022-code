package core;

public class DateTime {
    public final int year; // 1- Immutable attributes
    public final int month;
    public final int day;
    public final int hour;
    public final int minute;
    public final int seconds;

    private DateTime(int year, int month, int day, int hour, int minute, int seconds) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    static class Builder { // 2- Builder
        private int year;
        private int month;
        private int day;
        private int hour;
        private int minute;
        private int seconds;

        Builder withYear(int year) {
            this.year = year;
            return this;
        }
        Builder withMonth(int month) {
            this.month = month;
            return this;
        }
        Builder withDay(int day) {
            this.day = day;
            return this;
        }
        Builder withHour(int hour) {
            this.hour = hour;
            return this;
        }
        Builder withMinute(int minute) {
            this.minute = minute;
            return this;
        }
        Builder withSeconds(int seconds) {
            this.seconds = seconds;
            return this;
        }

        void valid() {
            // LOGIC TO CHECK SOME OBJECTS NON NULL..

        }

        DateTime build() {
            valid();
            DateTime dataTime = new DateTime(this.year, this.month,
                    this.day, this.hour, this.minute, this.seconds);
            return dataTime;
        }
    }



}
