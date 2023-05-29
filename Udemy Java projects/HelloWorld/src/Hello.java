public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Maik");

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");


        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;  // if - then - else

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

    }
}
