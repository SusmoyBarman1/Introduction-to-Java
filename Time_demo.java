
package basicjava;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_demo {
    public static void main(String[] args) {
        
        LocalTime time = LocalTime.now();
        System.out.println(time);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formatedTime = time.format(formatter);
        System.out.println("Time = "+formatedTime);
    }
}
