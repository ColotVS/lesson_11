public class lesson_11_09 {
    //Давай построим бизнес-центр, который состоит из двух зданий, один из которых только начинаем строить,
    //а второй — на этапе планирования, поэтому о нем мало что известно.
    //Тебе нужно будет создать два конструктора: один с параметрами, второй — без.
    //Они оба должны инициализировать поля floorsCount и developer.
    public static void main(String[] args) {
        Business build1 = new Business();
        Business build2 = new Business(10,"Wlad CO");
    }
}
class Business {

    private int floorsCount;
    private String developer;

    public Business() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public Business(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }
}