import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        // Posn circlePosistion = new Posn(3, 3);
        // // Circle implementation
        // Circle circle = new Circle(circlePosistion, 3);
        // String circleName = circle.getShapeName();
        // System.out.println(circleName);

        welcomeMenu();
        Scanner sc = new Scanner(System.in);
        writeLine("X: ");
        int x = sc.nextInt();
        writeLine("Y: ");
        int y = sc.nextInt();

        writeLine("Please select a shape. The options are: ");
        writeLine("1. Circle: ");
        writeLine("2. Square: ");
        writeLine("3. Rectangle: ");
        writeLine("Please enter the shape number");
        Posn shapePosisition = new Posn(x, y);

        int shapeNumber = sc.nextInt();

        switch (shapeNumber) {
            case 1:
                writeLine("You have selected circle.");
                writeLine("Please enter the radius");
                int circleRadius = sc.nextInt();

                break;

            default:
                break;
        }

        sc.close();

    }

    public static void welcomeMenu() {
        writeLine(".....Shapes Assigment.....");
        writeLine("Enter the shape Position:");
    }

    public static void writeLine(String line) {
        System.out.println(line);
    }
}