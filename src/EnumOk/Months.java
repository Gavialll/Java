package EnumNO;

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

    public static void similarMonths(Season season){
        System.out.println("Місяці з однаковою порою року");
        for (Months months : Months.values()) {
            if(months.getSeason().equals(season)){
                System.out.println(months.name());
            }
        }
    }
    public static void similarDays(int day){
        for (Months months : Months.values()) {
            if (months.getDay() == day) {
                System.out.println(months.name());
            }
        }
    }
    public static void maxDay(int day){
        boolean tr = true;
        for (Months months : Months.values()) {
            if (months.getDay() < day) {
                System.out.println(months.name());
                tr = false;
            }
        }
        if(tr){
            System.out.println("Немає місяців з меншою кількістю днів");
        }
    }
    public static void minDay(int day){
        boolean tr = true;
        for (Months months : Months.values()) {
            if (months.getDay() > day) {
                System.out.println(months.name());
                tr = false;
            }
        }
            if(tr){
                System.out.println("Немає місяців з більшою кількістю днів");
            }

    }
    public static void theNextSeason(Season season){
      int num = season.ordinal();
      num++;
        if (num == 0) {
            System.out.println(Season.WINTER);
        }else if (num == 1) {
            System.out.println(Season.SPRING);
        }else if (num == 2) {
            System.out.println(Season.SUMMER);
        }else if (num == 3) {
            System.out.println(Season.AUTUMN);
        }else if (num == 4) {
            System.out.println(Season.WINTER);
        }
    }
    public static void thePreviousSeason(Season season){
        int num = season.ordinal();
        num--;
        //if(num < 0){
        //    num = 3;
        //}
        switch (num){
            case 0:{
                System.out.println(Season.WINTER);
                break;
            }case 1:{
                System.out.println(Season.SPRING);
                break;
            }case 2:{
                System.out.println(Season.SUMMER);
                break;
            }case 3:{
                System.out.println(Season.AUTUMN);
                break;
            }
            default:{
                System.out.println(Season.AUTUMN);
            }
        }

        /*num --;
        if (num == -1) {
            System.out.println(Season.AUTUMN);
        }else if (num == 0) {
            System.out.println(Season.WINTER);
        }else if (num == 1) {
            System.out.println(Season.SPRING);
        }else if (num == 2) {
            System.out.println(Season.SUMMER);
        }else if (num == 3) {
            System.out.println(Season.AUTUMN);
        }*/
    }
    public static void oddDay(){
        System.out.println("Непарна кількість днів");
        for (Months months : Months.values()) {
            if(months.getDay() == 31){
                System.out.println(months.name());
            }
        }
    }
    public static void evenDay(){
        System.out.println("Парна кількість днів");
        for (Months months : Months.values()) {
            if(months.getDay() == 30 || months.getDay() == 28){
                System.out.println(months.name());
            }
        }
    }
    public static void thisMonthEvenDay(String nameMonths) {
        for (Months months : Months.values()) {
            if (months.name().equals(nameMonths)) {
                if(months.getDay() % 2 == 0){
                    System.out.println("Місяць має парну кількість днів");
                }
                else{
                    System.out.println("Місяць має непарну кількість днів");
                }
            }

        }
    }
    public static Season audit(String nameMonths) throws Exception {
        Season nameSeason = null;
        boolean tr = true;
            for (Months months : Months.values()) {
                if (months.name().equals(nameMonths)) {
                    System.out.println("Є такий місяць");
                    nameSeason = months.getSeason();
                    tr = false;
                }
            }
            if (tr) {
                throw new Exception();
            }

        return nameSeason;
    }
    public static int numberOfDays(String nameMonths){
        int numberOfDays = 0;
        for (Months months : Months.values()) {
            if (months.name().equals(nameMonths)) {
                numberOfDays = months.day;
            }
        }
        return numberOfDays;
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
