import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner; 

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line

        // Create a LocalDate object
        LocalDate date = LocalDate.of(year, month, day);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formattedDate = date.format(formatter);

        int dayOfWeekNumber = date.getDayOfWeek().getValue();

        // Map the day of the week number to format (i.e 1 = Monday)
        String dayOfWeek = DayOfWeek.of(dayOfWeekNumber).toString();

        System.out.println("The date is: " + formattedDate);
        System.out.println("The day of the week is: " + dayOfWeek);
        
    }
}