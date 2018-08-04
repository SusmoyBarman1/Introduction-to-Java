
package basicjava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_demo {
    public static void main(String[] args) {
        
        Date date = new Date();
        System.out.println(date);
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String date1 = dateFormat.format(date);
        System.out.println("date: "+date1);
    }
}
