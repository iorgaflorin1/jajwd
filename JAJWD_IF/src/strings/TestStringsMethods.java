/*
 * Testing String methods
 */
package strings;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.HashSet;
import java.util.Locale;

/**
 * Testing String methods
 * @author gheor
 */
public class TestStringsMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Getting Characters and Substrings by Index
        String thisIsAString = "This is a string!";
        Character chInPosition3 = thisIsAString.charAt(3);
        String substringFrom5to8 = thisIsAString.substring(5, 8);
        System.out.println("Char from index 3 of String "+thisIsAString+"is: "+chInPosition3);
        System.out.println("Substring from index 5 to index 8 of String "+thisIsAString+"is: "+substringFrom5to8);
        // Processing String
        System.out.println("String "+thisIsAString+" without whitespaces is "+thisIsAString.trim());
        System.out.println("String "+thisIsAString+" in lowercase is "+thisIsAString.toLowerCase());
        System.out.println("String "+thisIsAString+" in uppercase is "+thisIsAString.toUpperCase());
        // Searching in strings
        System.out.println("String "+thisIsAString+" contains substring is starting with index "+thisIsAString.indexOf("is"));
        // Repace a character with another in a String
        System.out.println("In String "+thisIsAString+" replacing i with t results "+thisIsAString.replace('i', 't'));
        // Compare Strings
        String thisIsAnotherString = "This is a string!"; // another String object with same content!
        System.out.println("Between two String objects with the same content there are no differences: "+thisIsAString.compareTo(thisIsAnotherString));
        System.out.println("If two String objects have the same content these are equals?: "+thisIsAString.equals(thisIsAnotherString));
        // conversions Strings to Number
        String aFloatNumber = "12.3f";
        float f = (Float.valueOf(aFloatNumber));
        System.out.println("Coverted String: "+aFloatNumber+" is the float number: "+f); 
        // or you can use paseXXXX() method
        float ff = Float.parseFloat(aFloatNumber);
        System.out.println("Coverted String: "+aFloatNumber+" is the float number: "+ff); 
        Float fObject = 23.4f;
        Short sObject = 210;
        System.out.println("The numbers converted to strings are: "+fObject.toString()+ " and "+sObject.toString());
        // Special classes for very offen string copntent change
        StringBuilder sb = new StringBuilder();// creates empty builder, capacity 16!
        System.err.println("Initial StringBuilder content is: "+sb);
        // adds 9 character string at beginning
        sb.append("Appended string! ");
        System.out.println("After append StringBuilder content is: "+sb);
        sb.ensureCapacity(255); //Ensures that the capacity is at least equal to the specified minimum.
        sb.append(25);
        System.out.println("After append 25 content is: "+sb);
        sb.delete(17, 19);
        System.out.println("After deleting from index 17 to 19 content is: "+sb);
        // date and time classes and methods
         // DayOFWeek and Moth Enums
        DayOfWeek dow = DayOfWeek.MONDAY;
        Month month = Month.MAY;
        Locale locale = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(month.getDisplayName(TextStyle.FULL, locale));
        // LocalDate, Year, Mounth classes
        LocalDate date = LocalDate.of(2000, Month.MAY, 15);
        LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(nextWed);
        YearMonth dateOne = YearMonth.now();
        System.out.printf("%s: %d%n", date, date.lengthOfMonth());
        Clock now = Clock.systemDefaultZone();
        LocalDate ld = LocalDate.now(now);
        System.out.println(ld);
        Month lm = ld.getMonth();
        int mv = lm.getValue();
        int ldd = ld.getDayOfMonth();
        System.out.println("Number of month is: "+mv);
        System.out.println("Number of day is: "+ldd);
        MonthDay dateTwo = MonthDay.of(mv, ldd);
        System.out.println(dateTwo);
        // LocalTime, LocalDateTime classes
        LocalTime thisSec = LocalTime.now();
        System.out.println("Local time: "+thisSec.getHour()+"H "+thisSec.getMinute()+"M "+thisSec.getSecond()+"S");
        // ZoneId and ZoneOffset classes
        HashSet<String> zones = (HashSet<String>) ZoneId.getAvailableZoneIds();
        for (String zone : zones) {
            System.out.println("Zone:"+zone);
        }
        // Zoned DateTime
        LocalDateTime leaving = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
        ZoneId leavingZone = ZoneId.of("Europe/Bucharest"); 
        ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);
        ZoneId arrivingZone = ZoneId.of("Europe/Paris");
        ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone).plusMinutes(210);
        System.out.println("Fling from:"+departure+"to "+arrival);



    }
    
}
