package az.coders.lesson8.abstarction;

public class Kvadrat extends Form{
    @Override
    public int getParametr(int teref1, int teref2) {
        return (teref1 + teref2)*2;
    }

    @Override
    public int getSahe(int teref1, int teref2) {
        return teref1*teref2;
    }
}
