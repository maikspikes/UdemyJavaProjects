import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("Area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println(wall.getWidth());
    }
}
