public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){}
    public Rectangle(double width, double length){}
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){return width;}
    public void setWidth(double width){this.width = width;}
    public double getLength(){return length;}
    public void setLength(double length){this.length = length;}
    public double getArea (){
        double area = width * length;
        return area;
    }
    public double getPerimetr () {
        double perimetr = 2 * (width + length);
        return perimetr;
    }
    public String toString(){
        String s = "Цвет прямоугольника: " + color + "\nЗакрашенный: " + filled + "\nДлина прямоугольника = " + length + "\nШирина прямоугольника = " + width + "\nПериметр прямоугольника = " + getPerimetr();
        return s;
    }
}
