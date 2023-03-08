package calendarpractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarPractice {

    public static void main(String[] args) {
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        System.out.println(cal.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("MM-dd-yyyy");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
    }
}
