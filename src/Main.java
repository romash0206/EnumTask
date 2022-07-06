
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите дату: ");
        String date = in.nextLine();
        // 01.05.2022
        String[] newDate = date.split("\\.");
        int dayNumber=Integer.parseInt(newDate[0]);
        int monthNumber=Integer.parseInt(newDate[1]);
        int yearNumber=Integer.parseInt(newDate[2]);


        Month[] months = Month.values();
        Month month = months[monthNumber-1];

        int currentDay = month.getDaysBefore()+dayNumber;


        Day[] days = Day.values();
        Day day = days [currentDay%7];

        //System.out.println(month.getName());

        //"день недели, число месяц год, номер недели (вторник, 5 июля 2022, неделя 28).
        System.out.println(day.getName()+" "+dayNumber+" "+month.getName()+" "+yearNumber+" неделя "+(currentDay/7+1));
        //System.out.println(Arrays.toString(newDate));

        //System.out.println(Arrays.toString(Month.values()));
        //System.out.println(Month.values()[5]);
    }

}
