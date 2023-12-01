public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] an = {1,2,3,4,5};
        int[] bn = {6, 7, 8, 9};
        IBuilder builder1 = new Fraction1Builder(an);
        IBuilder builder2 = new Fraction2Builder(an, bn);
        builder1.getFraction();
        builder2.getFraction();


    }
}

