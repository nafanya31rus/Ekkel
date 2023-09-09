package glava4.initialization;

class ifFinalize {
    boolean checkOut = false;

}

public class MyFinalize {
    public void finalize() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        MyFinalize finalize = new MyFinalize();
        System.out.println(finalize);
    }
}
