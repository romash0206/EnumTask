public enum Month {
    JANUARY("Января",1,31,0),
    FEBRUARY("Февраля",2,28,31),
    MARCH("Марта", 3,31,59),
    APRIL("Апреля",4,30,90),
    MAY("Мая",5,31,120),
    JUNE("Июня",6,30,151),
    JULY("Июля",7,31,181),
    AUGUST("Августа",8,31,212),
    SEPTEMBER("Сентября",9,30,243),
    OCTOBER("Октября",10,31,273),
    NOVEMBER("Ноября",11,30,304),
    DECEMBER("Декабря",12,31,334);

    private String name;
    private int account;
    int days;
    int daysBefore;

    Month(String name, int account, int days, int daysBefore) {
        this.name = name;
        this.account = account;
        this.days = days;
        this.daysBefore = daysBefore;
    }

    public String getName() {
        return name;
    }

    public int getAccount() {
        return account;
    }

    public int getDays() {
        return days;
    }

    public int getDaysBefore() {
        return daysBefore;
    }
}
