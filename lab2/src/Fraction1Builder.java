public class Fraction1Builder implements IBuilder {
    private int[] an;

    public Fraction1Builder(int[] an) {
        this.an = an;
    }

    @Override
    public void getFraction() {
        Composite1 composite1 = new Composite1(an);
        composite1.execute();
    }
}

