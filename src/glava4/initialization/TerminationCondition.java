
package glava4.initialization;
class Book{
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if(checkedOut)
            System.out.println("ошибка: checkedOut");
    }
}

 public class TerminationCondition {
     public static void main(String[] args) {
         Book novel = new Book(true);
         //правильная очистка
         novel.checkIn();
         //теряем ссылку, забыли про очитску:
         new Book(true);
         System.gc();
     }
}