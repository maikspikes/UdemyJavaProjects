import java.util.Scanner;
public class SortedArray {


/*
    public static int Insert(){
        System.out.println("How many integers do you want to insert? ");
        Scanner scanner = new Scanner(System.in);

        return ;
    }
*/


    public static int[] getIntegers(){
        Scanner InsertingNumber = new Scanner(System.in);

        System.out.println("How many integers do you want to insert????");
        String name = InsertingNumber.next();

        int number = Integer.parseInt(name);


        System.out.println(" Enter " + number + " integer values:\r");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i]= scanner.nextInt();
        }

//        sortIntegers(array);

        return array;
    }

    public static void printArray (int[] array){
        for (int i=0; i< array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers (int[] sortedArray) {

        for(int i=0; i< sortedArray.length; i++){

            for (int j=i+1; j<sortedArray.length; j++){
                if(sortedArray[i]< sortedArray[j]){
                    int number = sortedArray[i];
                    sortedArray[i]= sortedArray[j];
                    sortedArray[j]= number;
                }
            }
        }

//        printArray(sortedArray);

        return sortedArray;
    }


}