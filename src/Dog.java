public abstract class Dog {
    private double avgAge;
    private double avgHeight;
    public double getAvgAge()
    {
        return avgAge;
    }
    public double getAvgHeight()
    {
        return avgHeight;
    }
    public Dog (double avgAge, double avgHeight)
    {
        this.avgAge = avgAge;
        this.avgHeight = avgHeight;
    }
}
