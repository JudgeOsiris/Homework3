public class Square extends Rectangle {
    protected double side;
    public Square(){};
    public Square(double side){};
    public Square(double side, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.side = side;
    };
    public double getSide(){return side;}
    public void setSide(double side){this.side = side;}
    public void setWidth(double side){
        this.width = side;
    }
    public void setLenght(double side){
        this.length = side;
    }
    public String toString(){
        String s = "Цвет квадрата: " + color + "\nЗакрашенный: " + filled + "\nСторона квадрата = " + side;
        return s;
    }
}
