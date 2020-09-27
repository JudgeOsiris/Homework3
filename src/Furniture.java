public abstract class Furniture {
    private double price;
    private String materials;
    public String getMaterials()
    {
        return materials;
    }
    public double getPrice()
    {
        return price;
    }
    public void setMaterials(String materials) {this.materials = materials;}
    public void setPrice(double price) {this.price = price;}
    public Furniture (String materials, double price)
    {
        this.materials = materials;
        this.price = price;
    }
    public Furniture (){};
}
