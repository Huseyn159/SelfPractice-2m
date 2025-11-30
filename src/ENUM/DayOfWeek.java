package ENUM;

public enum DayOfWeek {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean workDay;

    DayOfWeek(boolean workDay) {
        this.workDay = workDay;
    }

    public boolean isWorkDay() {
        return workDay;

    }

    public boolean isWeekend(){
        return !workDay;
    }


}
