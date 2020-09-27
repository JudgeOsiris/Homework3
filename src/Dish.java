public abstract class Dish {
    private String material;
    private double price;
    public String getMaterial()
    {
        return material;
    }
    public double getPrice()
    {
        return price;
    }
    public Dish (String material, double price)
    {
        this.material = material;
        this.price = price;
    }
}
