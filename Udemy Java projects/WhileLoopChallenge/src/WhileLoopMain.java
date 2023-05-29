public class WhileLoopMain {
    public static void main(String[] args) {
        int num = 4;
        int finishNum = 20;
        int oddNumbers = 0;
        int evenNumbers = 0;
        while (num <= finishNum) {
            num++;
            if (!isEvenNumber(num)) {
                oddNumbers++;
                continue;
            } else {
                evenNumbers++;
                if (evenNumbers >= 5) {
                    break;
                }
            }
            System.out.println("Even number " + num);
        }
        System.out.println("odd numbers are = " + oddNumbers);
        System.out.println("even numbers are = " + evenNumbers);
    }

    public static boolean isEvenNumber(int num) {
        
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
        
    }
}
