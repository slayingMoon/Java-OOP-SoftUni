package ExceptionsAndErrorHandling.fixing;

public class Fixing {
    public static void main(String[] args) {

        String[] weekDays = new String[5];

        weekDays[0] = "Monday";
        weekDays[1] = "Tuesday";
        weekDays[2] = "Wednesday";
        weekDays[3] = "Thursday";
        weekDays[4] = "Friday";

        for (int i = 0; i <= weekDays.length; i++) {
            try {
                System.out.println(weekDays[i]);
            }catch (IndexOutOfBoundsException ignored) {}
        }

    }
}
