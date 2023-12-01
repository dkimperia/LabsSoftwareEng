public class Composite1 implements IComponent {
    private int an[];
    public static int count = 0;
    private int a;
    private IComponent next;

    public Composite1(int[] an) {
        this.an = an;
    }


    public void createNext() {
        IComponent next;
        if (count == an.length - 1) {
            next = new Leaf1();
        } else {
            next = new Composite1(an);
        }
        this.setNext(next);
    }

    @Override
    public void setNext(IComponent next) {
        this.next = next;
    }

    @Override
    public void setA(int value) {
        this.a = value;
    }

    @Override
    public void execute() {
        this.setA(an[count]);
        if (count != an.length - 1) {
            System.out.print("(" + a + " + 1/");
        } else {
            System.out.print(a);
        }
        createNext();
        count++;
        next.execute();
    }
}
