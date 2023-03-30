import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        writeLine(".....Shapes Assigment.....");
        shapeSwitchLogic();
    }

    public static void writeLine(String line) {
        System.out.println(line);
    }

    public static void shapeCalculations(shape selectedShape) {
        writeLine(selectedShape.getShapeName() + " created.");
        int shapeArea = Math.toIntExact(Math.round(selectedShape.area()));
        int shapePerimeter = Math.toIntExact(Math.round(selectedShape.perimeter()));
        writeLine("The area is: " + shapeArea + " units");
        writeLine("The perimeter is: " + shapePerimeter + " units");
    }

    public static void shapeSwitchLogic() {
        writeLine("Enter the shape Position:");
        Scanner sc = new Scanner(System.in);
        writeLine("X: ");
        int x = sc.nextInt();
        writeLine("Y: ");
        int y = sc.nextInt();
        Posn shapePosition = new Posn(x, y);

        writeLine("Please select a shape. The options are: ");
        writeLine("1. Circle: ");
        writeLine("2. Square: ");
        writeLine("3. Rectangle: ");
        int shapeNumber = sc.nextInt();

        switch (shapeNumber) {
            case 1:
                writeLine("Option 1 selected.");
                writeLine("Please enter the radius: ");
                int circleRadius = sc.nextInt();
                Circle circle = new Circle(shapePosition, circleRadius);
                shapeCalculations(circle);
                break;
            case 2:
                writeLine("Option 2 selected.");
                writeLine("Please enter the side length: ");
                int sideLength = sc.nextInt();
                Square square = new Square(shapePosition, sideLength);
                shapeCalculations(square);
                break;
            case 3:
                writeLine("Option 3 selected.");
                writeLine("Please enter the height: ");
                int height = sc.nextInt();
                writeLine("Please enter the width: ");
                int width = sc.nextInt();
                Rectangle retangle = new Rectangle(shapePosition, width, height);
                shapeCalculations(retangle);
                break;
            default:
                writeLine("No menu item selected so the program will exit.");
                break;
        }

        sc.close();
    }
}