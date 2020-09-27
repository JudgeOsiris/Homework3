public class Plate extends Dish{
    private double square;
    public double getSquare()
    {
        return square;
    }
    public Plate (String material, double price, double square)
    {
        super(material, price);
        this.square = square;
    }
    public String toString (){
        String s = "Посуда: тарелка\n" + "Материал: " + getMaterial() + "\n" + "Цена за 1 шт = " + getPrice() + "\n" + "Плоцащь = " + square;
        return s;
    }
}
