package euler;

import java.util.ArrayList;
import java.util.Arrays;

public class P19 {
    public static void main(String[] args){

        // Vars for assessing leap/not years and months for which Sunday = first day
        ArrayList<int[]> set = new ArrayList<int[]>();
        ArrayList<Integer> days = new ArrayList<Integer>();
        days.add(0);
        int[] temp = new int[2];
        int count = 0;
        int sundays = 0;

        // Loop thru years and check if Leap with helper method
        for(int i = 1901; i <= 2000; i++){
            temp[0] = i;
            temp[1] = LeapYear(i);
            set.add(temp);
            count++;
        }

        // Reset count and use as key for Loop thru ArrayList of leap/not years and add days together
        count = 0;
        for (int[] ints : set) {
            int[] months = MonthSize(ints[1]);
            for (int month : months) {
                count += month;
                days.add(count);
            }
        }

        // Loop thru days array (adjusted with 2 day leading offset between 1900/1901) and check for First Sundays
        // Note: specified that 1/1/1900 = Sunday, but we start on 1/1/1901 = Monday!
        for(int day : days){
            if((day + 2) % 7 == 0){
                sundays++;
            }
        }

        // Number of First Sundays
        System.out.println(sundays);
    }

    // Method to classify leap/not year
    public static int LeapYear(int year) {
        if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            return 1;
        }
        else {
            return 0;
        }
    }

    // Method to return number of days per month in leap/not year (for running days total in day array)
    public static int[] MonthSize(int status){
        if(status == 1){
            return new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }
        else{
            return new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }
    }
}
