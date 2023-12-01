import java.util.Arrays;

class QuadraticEquation{
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}

class QuadraticSolution {

    private final QuadraticEquation equation;
    private final double a;
    private final double b;
    private final double c;

    public QuadraticSolution(QuadraticEquation equation){
        this.equation = equation;
        a = equation.getA();
        b = equation.getB();
        c = equation.getC();
    }

    public double[] getRoots(){
        double D, x1, x2;
        double[] res = new double[2];

        D = b * b - 4 * a * c;
        if (D > 0){
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            res[0] = x1;
            res[1] = x2;
            return res;
        }
        else if (D == 0){
            x1 = -b / (2 * a);
            res[0] = x1;
            res[1] = x1;
            return res;
        }
        else{
            res = null;
            return res;
        }
    }

    public double getRoot(){
        return -c / b;
    }

    public boolean isLinear(){
        if (a == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isNoRoots(){
        if (a == 0 && b == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isInfinity(){
        if (a == 0 && c == 0){
            return true;
        }
        else{
            return false;
        }
    }
}


class QuadraticSolver {

    private QuadraticSolution solution;

    public QuadraticSolver(QuadraticSolution solution){
        this.solution = solution;
    }

    public void solve(){
        if (solution.isInfinity()){
            System.out.println("Уравнение имеет бесконечное количество решений");
        }
        else if (solution.isNoRoots()){
            System.out.println("Уравнение не имеет корней");
        }
        else if (solution.isLinear()){
            System.out.println(solution.getRoot());
        }
        else{
            if (solution.getRoots() == null){
                System.out.println("Уравнение не имеет корней");
            }
            else{
                System.out.println(Arrays.toString(solution.getRoots()));
            }
        }
    }

}



public class Main {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(0, 1, -1);
        QuadraticSolution solution = new QuadraticSolution(equation);
        QuadraticSolver solver = new QuadraticSolver(solution);
        solver.solve();


        }
    }