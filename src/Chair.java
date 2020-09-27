public class Chair extends Furniture {
    private double square;
    public double getSquare()
    {
        return square;
    }
    public void setSquare(double square){this.square = square;}
    public Chair (String materials, double price, double square)
    {
        super(materials, price);
        this.square = square;
    }
    public Chair (){};
    public String toString (){
        String s = "Мебель: стул\n" + "Материал: " + getMaterials() + "\n" + "Цена за 1 шт = " + getPrice() + "\n" + "Площадь сидения = " + square;
        return s;
    }
}
