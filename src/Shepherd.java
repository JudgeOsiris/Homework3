public class Shepherd extends Dog {
    private boolean canBeTrained;
    public boolean getCanBeTrained(){
        return canBeTrained;
    }
    public Shepherd (double avgAge, double avgHeight, boolean canBeTrained)
    {
        super(avgAge, avgHeight);
        this.canBeTrained = canBeTrained;
    }
    public String toString (){
        String s = "Порода: овчарка\n" + "Средний возраст = " + getAvgAge() + "\n" + "Средний рост = " + getAvgHeight() + "\n" + "Поддается дрессировке: " + canBeTrained;
        return s;
    }
}
