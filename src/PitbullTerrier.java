public class PitbullTerrier extends Dog {
    private boolean aggressive;
    public boolean getAggressive() {
        return aggressive;
    }
    public PitbullTerrier (double avgAge, double avgHeight, boolean aggressive)
    {
        super(avgAge, avgHeight);
        this.aggressive = aggressive;
    }
    public String toString (){
        String s = "Порода: питбультерьер\n" + "Средний возраст = " + getAvgAge() + "\n" + "Средний рост = " + getAvgHeight() + "\n" + "Агрессивный: " + aggressive;
        return s;
    }
}