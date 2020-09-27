import java.util.Scanner;
public class Loader {
    public static void main (String[] args){
        Dish plate = new Plate("керамика", 450, 300);
        Dish cup = new Cup("стекло", 200, 100);
        System.out.println(plate.toString());
        System.out.println("------------------------");
        System.out.println(cup.toString());
        System.out.println("------------------------");
        Dog shepherd = new Shepherd(12, 63, true);
        Dog pitbullTerrier = new PitbullTerrier(14, 55, true);
        Dog husky = new Husky(13, 56, "blue");
        System.out.println(shepherd.toString());
        System.out.println("------------------------");
        System.out.println(pitbullTerrier.toString());
        System.out.println("------------------------");
        System.out.println(husky.toString());
        System.out.println("------------------------");
        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.purchaseOfFurniture();
        System.out.println("------------------------");
        Shape circle = new Circle(10, "red", true);
        System.out.println(circle.toString());
        System.out.println("------------------------");
        Shape rectangle = new Rectangle(5, 10, "blue", false);
        System.out.println(rectangle.toString());
        System.out.println("------------------------");
        Shape square = new Square(5, "blue", true);
        System.out.println(square.toString());
    }
}
