public class SumOddMain {
    public static void main(String[] args) {
        System.out.println(sumOdd(-4, 6));
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            return number % 2 != 0;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if ((start > 0) && (end > 0) && (end >= start)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        else return -1;
    }
}
