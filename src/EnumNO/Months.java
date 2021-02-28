package Enum;

public enum Months {
    JANUARY(31, Season.WINTER),
    FEBRUARY(28, Season.WINTER),
    MARCH(31, Season.SPRING),
    APRIL(30, Season.SPRING),
    MAY(31, Season.SPRING),
    JUNE(30, Season.SUMMER),
    JULY(31, Season.SUMMER),
    AUGUST(31, Season.SUMMER),
    SEPTEMBER(30, Season.AUTUMN),
    OCTOBER(31, Season.AUTUMN),
    NOVEMBER(30, Season.AUTUMN),
    DECEMBER(31, Season.WINTER);

    private int day;
    private Season season;

    public static void Provirka(String nameMonths) {
        for (Months months : Months.values()) {
            if (months.name().equals(nameMonths)) {
                System.out.println("Є такий місяць");
            }
        }
    }

    public static Season returnSeason(Season season){
        return  season;
    }

    Months(int day, Season season) {
        this.day = day;
        this.season = season;
    }

    public int getDay() {
        return day;
    }

    public Season getSeason() {
        return season;
    }
}
