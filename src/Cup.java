public class Cup extends Dish {
    private double volume;
    public double getVolume()
    {
        return volume;
    }
    public Cup (String material, double price, double volume)
    {
        super(material, price);
        this.volume = volume;
    }
    public String toString (){
        String s = "Посуда: кружка\n" + "Материал: " + getMaterial() + "\n" + "Цена за 1 шт = " + getPrice() + "\n" + "Объем = " + volume;
        return s;
    }
}
