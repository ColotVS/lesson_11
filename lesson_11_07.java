public class lesson_11_07 {
    //Попробуем сконструировать свой первый небоскреб и объявить о результате выполнения в консоли.
    //Для этого тебе нужно вызвать конструктор класса
    //Skyscraper в методе main и в теле конструктора вывести в консоль текст "Небоскреб построен.".
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
    }
}
class Skyscraper {
    public String ready;

    public Skyscraper() {
        System.out.println("Небоскреб построен.");
    }
}
