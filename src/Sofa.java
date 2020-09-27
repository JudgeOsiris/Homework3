public class Sofa extends Furniture {
    private String color;
    public String getColor()
    {
        return color;
    }
    public void setColor(String color){this.color = color;}
    public Sofa (String materials, double price, String color)
    {
        super(materials, price);
        this.color = color;
    }
    public Sofa (){};
    public String toString (){
        String s = "Мебель: диван\n" + "Материал: " + getMaterials() + "\n" + "Цена за 1 шт = " + getPrice() + "\n" + "Цвет = " + color;
        return s;
    }
}
