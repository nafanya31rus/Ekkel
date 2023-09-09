package glava4;

//что происходит при приведении типов
//float или double к целочисленным значениям?
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.print("(int)above: " + (int)above);
        System.out.print("(int)below: " + (int)below);
        System.out.print("(int)fabove: " + (int)fabove);
        System.out.print("(int)fbelow: " + (int)fbelow);
    }
}
