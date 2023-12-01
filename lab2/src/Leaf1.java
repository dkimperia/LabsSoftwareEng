public class Leaf1 implements IComponent {
    private int a;
    private IComponent next;

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
        for (int i = 0; i < Composite1.count - 1; i++) {
            System.out.print(")");
        }
        System.out.println("\n");
    }

}
