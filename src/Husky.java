public class Husky extends Dog{
    private String eyesColor;
    public String getEyesColor(){
        return eyesColor;
    }
    public Husky (double avgAge, double avgHeight, String eyesColor)
    {
        super(avgAge, avgHeight);
        this.eyesColor = eyesColor;
    }
    public String toString (){
        String s = "Порода: лайка\n" + "Средний возраст = " + getAvgAge() + "\n" + "Средний рост = " + getAvgHeight() + "\n" + "Цвет глаз: " + eyesColor;
        return s;
    }
}
