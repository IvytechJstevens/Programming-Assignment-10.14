public class Main {
    public static void main(String[] args) {
        // Create a MyDate object for the current date
        MyDate currentDate = new MyDate();

        // Create a MyDate object with specified elapsed time
        MyDate customDate = new MyDate(34355555133101L);

        // Display information
        System.out.println("Current Date: " + currentDate.getYear() + "-" + (currentDate.getMonth() + 1) + "-" + currentDate.getDay());
        System.out.println("Custom Date: " + customDate.getYear() + "-" + (customDate.getMonth() + 1) + "-" + customDate.getDay());
    }
}
