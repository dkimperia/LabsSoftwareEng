public class Fraction2Builder implements IBuilder {

    private int[] an;
    private int[] bn;

    public Fraction2Builder(int[] an, int[] bn) {
        this.an = an;
        this.bn = bn;
    }

    @Override
    public void getFraction() {
        Composite2 composite = new Composite2(an, bn);
        composite.execute();
    }
}
