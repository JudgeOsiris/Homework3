public class Circle extends Shape {
    protected double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){return radius;}
    public void setRadius(double radius){this.radius = radius;}
    public double getArea (){
        double area = radius * radius * 3.14;
        return area;
    }
    public double getPerimetr () {
        double perimetr = 2 * 3.14 * radius;
        return perimetr;
    }
    public String toString(){
        String s = "Цвет круга: " + color + "\nЗакрашенный: " + filled + "\nРадиус круга = " + radius + "\nПлощадь круга = " + getArea() + "\nПериметр круга = " + getPerimetr();
        return s;
    }
}
