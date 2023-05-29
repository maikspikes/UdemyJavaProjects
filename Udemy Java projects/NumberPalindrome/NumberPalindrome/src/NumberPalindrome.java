public class NumberPalindrome {
    public static void main() {
        

    }

    //code not made by me and not yet understood by me

    public static boolean isPalindrome (int number) {
        if (number < 0){
            number = -number;
        }
        int reverse = 0;
        int temp = number;
        while (temp != 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;

        }
        return reverse == number;
    }
}
