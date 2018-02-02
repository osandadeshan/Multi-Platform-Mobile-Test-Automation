package stepImpl;

import pages.BasePage;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static util.DateTime.*;


public class Demo {

static String examDate = "2-11-2017";

    public static void main(String[] args) throws ParseException {
        System.out.println(remainingDaysAndEndDateString(getTodayDate(), examDate));

        List<Date> listDates = new ArrayList<Date>();
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            listDates.add(dateFormatter.parse("2013-09-30"));
            listDates.add(dateFormatter.parse("2013-05-31"));
            listDates.add(dateFormatter.parse("2013-11-28"));
        } catch (ParseException ex) {
            System.err.print(ex);
        }

        System.out.println("Before sorting: " + listDates);

        Collections.sort(listDates);

        System.out.println("After sorting: " + listDates);
        try {
            convertToEpochTime("July 32, 2017, 23:33:19");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void convertToEpochTime(String dateTimeString) throws ParseException {
        dateTimeString = dateTimeString.replaceAll(",", "").concat(".000 UTC");
        System.out.println("Output: " + dateTimeString);
        SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");
        Date date = df.parse(dateTimeString);
        long epoch = date.getTime();
        System.out.println(epoch);
    }

    public static void listElements(){
        BasePage basePage = new BasePage();
        basePage.getWebElementsNameList("android.support.v7.widget.RecyclerView", "com.pearsoned.smartflashcards:id/recyclerViewCards");
    }


}
