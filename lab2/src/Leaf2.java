public class Leaf2 implements IComponent {

    private int a;
    private IComponent next;

    public Leaf2(int value) {
        this.a = value;
    }


    @Override
    public void setA(int value) {
        this.a = value;
    }

    @Override
    public void setNext(IComponent next) {
        this.next = null;
    }

    @Override
    public void execute() {
        System.out.print(a);
        for (int i = 0; i < Composite2.count; i++) {
            System.out.print(")");
        }
        System.out.println("\n");
    }
}
