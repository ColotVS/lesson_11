public class lesson_11_39 {
    //Давай создадим каталог новых моделей авто у нас на производстве.
    //Для этого нам нужно создать один метод initialize,
    //который будет инициализировать такие поля объекта типа Auto: модель, год выпуска, цвет.
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.initialize("Tesla",2019,"Silver");
    }
}
class Auto {
    private String model;
    private int year;
    private String color;

    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
}
