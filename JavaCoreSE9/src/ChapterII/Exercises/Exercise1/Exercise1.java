
package ChapterII.Exercises.Exercise1;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Exercise1 {
    public static void main(String[] args){
        String[] week ={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        for(int i=0; i<7; i++){
        System.out.print(week[i]+" ");
        }
        LocalDate date = LocalDate.of(2013, 3, 1);
        int month = 3;
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println();
        for(int i=1; i<=value; i++){
            System.out.print("    ");
        }
        while(date.getMonthValue() == month){
           if(date.getDayOfWeek().getValue()%7==0){
            System.out.println();
           }
           System.out.printf("%4d",date.getDayOfMonth());
            date =date.plusDays(1);
        }
        System.out.println();
        
    }
}
