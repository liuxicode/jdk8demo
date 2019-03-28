import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * @Auther: liuxi
 * @Date: 2019/3/27 16:09
 * @Description:
 */
public class TimeDemo {

    public static void main(String[] args) {
        currentTime();
    }

    public static void currentTime(){

        LocalDate localDate = LocalDate.now();

        System.out.println("curret day :" + localDate);

        int year = localDate.getYear();
        System.out.println("year:"+year);
        Month month = localDate.getMonth();
        System.out.println("month:"+month);
        int day1 = localDate.getDayOfYear();
        System.out.println("yearDay:"+day1);
        int day2 = localDate.getDayOfMonth();
        System.out.println("monthDay:"+day2);
        DayOfWeek day3 = localDate.getDayOfWeek();
        System.out.println("weekDay:"+day3);

        LocalDate localDate1 = LocalDate.of(2019,12,31);

        System.out.print("the day :" + localDate1);
    }

}
