public class SpeedConverter {
    public static void main(String[] args) {

        System.out.println("He is driving at " + toMilesPerHour(10.25) + " miles per hour");
    }


    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

}

/* This method should not return anything (void)
 and it needs to calculate milesPerHour from the kilometersPerHour parameter*/