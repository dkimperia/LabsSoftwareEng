public class Composite2 implements IComponent {

    private int a;
    private int b;
    private IComponent next;
    private int an[];
    private int bn[];
    public static int count = 0;

    public Composite2(int an[], int[] bn) {
        this.an = an;
        this.bn = bn;
    }


    public void createNext() {
        IComponent next;
        if (count == an.length - 2) {
            next = new Leaf2(an[count + 1]);
        } else {
            next = new Composite2(an, bn);
        }
        this.setNext(next);
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void setNext(IComponent next) {
        this.next = next;
    }

    @Override
    public void execute() {
        this.setA(an[count]);
        this.setB(bn[count]);
        if (count != an.length - 1) {
            System.out.print("(" + a + " + " + b + "/");
        } else {
            System.out.print(a);
        }
        createNext();
        count++;
        next.execute();
    }
}
