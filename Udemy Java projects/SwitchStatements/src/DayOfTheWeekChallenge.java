public class DayOfTheWeekChallenge {
    public static void main(String[] args) {

        printDayOfWeek(4);
    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day){
            case 0 -> {
                yield "Sunday";  }
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println(day + " Stands for " + dayOfWeek );

    }
}
