package glava4.constructor;

class Rock2 {
    Rock2(int i) {
        System.out.println("Rock" + i + " ");
    }
}

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            new Rock2(i);
        }
    }

}
