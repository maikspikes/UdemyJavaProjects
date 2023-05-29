

public class TeenNumberChecker {


    public static void main(String[] args) {

    }


    public static boolean hasTeen(int age1, int age2, int age3) {

        return ( isTeen(age1) || isTeen(age2) || isTeen(age3));
    }

    public static boolean isTeen(int age4) {

        return (age4 >= 13 && age4 <= 19);
    }
}

