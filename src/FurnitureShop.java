import java.util.Scanner;
public class FurnitureShop {
    public void purchaseOfFurniture() {
        System.out.println("Какую мебель вы хотите купить:\n 1 - стул;\n 2 - диван.");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = Integer.parseInt (s);
        if (i == 1 || i == 2)
        {
            if (i == 1)
            {
                Chair chair = new Chair();
                System.out.print("Введите материалы: ");
                String a = scanner.nextLine();
                chair.setMaterials(a);
                System.out.print("Введите цену: ");
                a = scanner.nextLine();
                int b = Integer.parseInt (a);
                chair.setPrice(b);
                System.out.print("Введите площадь сидения: ");
                a = scanner.nextLine();
                b = Integer.parseInt(a);
                chair.setSquare(b);
                System.out.print("Введите количество стульев: ");
                a = scanner.nextLine();
                b = Integer.parseInt(a);
                System.out.println("Мебель: стул\n" + "Материал: " + chair.getMaterials() + "\nЦена за 1 шт = " + chair.getPrice() + "\nПлощадь сидения = " + chair.getSquare() + "\nСтоимость вашей покупки = " + b * chair.getPrice());
            }
            else
            {
                Sofa sofa = new Sofa();
                System.out.print("Введите материалы: ");
                String a = scanner.nextLine();
                sofa.setMaterials(a);
                System.out.print("Введите цену: ");
                a = scanner.nextLine();
                int b = Integer.parseInt (a);
                sofa.setPrice(b);
                System.out.print("Введите цвет: ");
                a = scanner.nextLine();
                sofa.setColor(a);
                System.out.print("Введите количество диванов: ");
                a = scanner.nextLine();
                b = Integer.parseInt(a);
                System.out.println("Мебель: диван\n" + "Материал: " + sofa.getMaterials() +  "\nЦена за 1 шт = " + sofa.getPrice() + "\nЦвет = " + sofa.getColor() + "\nСтоимость вашей покупки = " + b * sofa.getPrice());
            }
        }
        else System.out.println("Введены неверные данные.");
    }
}
