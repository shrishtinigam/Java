import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class List_Days_20BRS1193{
    public static void main(String args[]){

        System.out.println("A. Create an empty list using collection frame work named list_days to hold the days of the week.");
        ArrayList<String> week = new ArrayList<String>();
        
        System.out.println("\nB. Add all the weekdays to the created list except Wednesday.");
        week.add("Monday");
        week.add("Tuesday");
        week.add("Thursday");
        week.add("Friday");

        System.out.println("\nC. Print the resultant list");
        System.out.println("\nList: " + week);

        System.out.println("\nD. Iterate the list using any three different ways (either using for or foreach or Iterator Interface)");
        System.out.println("\nUsing for loop...");
        for(int i = 0; i < week.size(); i++){
            System.out.println(week.get(i));
        }

        System.out.println("\nUsing foreach loop...");
        for (String string : week) {
            System.out.println(string);
        }

        System.out.println("\nUsing iterator...");
        Iterator<String> it = week.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nE. Add Sunday to the beginning of the list and Saturday to the ending of the list and Wednesday after Tuesday in the List.");
        week.add(0,"Sunday");
        week.add(3,"Wednesday");
        week.add(6, "Saturday");
        System.out.println("List: " + week);

        System.out.println("\nF. Set Sunday and Saturdays as Holiday.");
        week.set(0, "Holiday");
        week.set(6, "Holiday");
        System.out.println("List: " + week);

        System.out.println("G. Check whether Holiday is present in list or not.");
        if(week.contains("Holiday")){
            System.out.println("Yes, the list contains Holiday.");
        }else{
            System.out.println("No, the list does not contain Holiday.");
        }

        System.out.println("H. Remove Holidays from the list.");
        ArrayList<String> holidays = new ArrayList<String>();
        holidays.add("Holiday");
        week.removeAll(holidays);
        System.out.println("List: " + week);
        
        System.out.println("\nI. Copy all the elements form list_days into new list named week_days.");
        ArrayList<String> week_days = new ArrayList<String>();
        week_days.addAll(week);
        System.out.println("Week Days List: " + week_days);

        System.out.println("\nJ. Sort the new list and display it.");
        Collections.sort(week_days);  
        System.out.println("\nWeek Days List: " + week_days);

        System.out.println("\nK. Shuffle and display the elements of list_days.");
        Collections.shuffle(week);
        System.out.println("\nList: " + week);

        System.out.println("\nL. Compare days_list with week_days.");
        if(week.equals(week_days)){
            System.out.println("\nYes, both are equal");
        }else{
            System.out.println("\nNo, both are not equal");
        }

        System.out.println("\nM. Sort and Reverse both the lists.");
        Collections.sort(week_days);
        System.out.println("\nWeek Days List: " + week_days);
        Collections.sort(week);
        System.out.println("\nWeek List: " + week);
        Collections.reverse(week_days);
        System.out.println("\nReverse Week Days List: " + week_days);
        Collections.reverse(week);
        System.out.println("\nReverse Week List: " + week);

        System.out.println("\nN. Compare days_list with week_day."); 
        if(week.equals(week_days)){
            System.out.println("\nYes, both are equal.");
        }else{
            System.out.println("\nNo, both are not equal.");
        }
        
        System.out.println("\nO. Swap 1st and last elements in both the lists.");
        Collections.swap(week, 0, 4);
        Collections.swap(week_days, 0, 4);
        System.out.println("\nSwapped List: " + week_days);
        System.out.println("\nSwapped List: " + week);

        System.out.println("\nP. Remove all the elements from the list_days.");
        week.clear();
        System.out.println("\nList: " + week);

        System.out.println("\nQ. Check the list_days is empty or not.");
        if(week.isEmpty()){
            System.out.println("\nYes, week is empty.");
        }else{
            System.out.println("\nNo, week is not empty.");
        }

        System.out.println("\nR. Shuffle and display the elements of list_days.");
        Collections.shuffle(week);
        System.out.println("\nList: " + week);

        System.out.println("\nS. Compare days_list with week_days.");
        if(week.equals(week_days)){
            System.out.println("\nYes, both are equal");
        }else{
            System.out.println("\nNo, both are not equal");
        }
    }
}