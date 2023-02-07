// Live clock
// Updates every second

import java.util.Calendar;

public class Clock {
    public static void main (String[]args)  {
        while (true) {
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            String ampm = (calendar.get(Calendar.AM_PM) == Calendar.AM) ? "AM" : "PM";

            String hourString = Integer.toString(hour);
            String minuteString = Integer.toString(minute);
            String secondString = Integer.toString(second);

            if (hourString.length() == 1) {
                hourString = "0" + hourString;
            }
            if (minuteString.length() == 1) {
                minuteString = "0" + minuteString;
            }
            if (secondString.length() == 1) {
                secondString = "0" + secondString;
            }

            // Clear the terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println(hourString + ":" + minuteString + ":" + secondString + " " + ampm);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}