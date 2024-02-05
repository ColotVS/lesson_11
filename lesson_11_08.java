public class lesson_11_08 {
    //Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных способа вывода информации:
    //Объявляет о результате постройки.
    //Объявляет о результате и указывает количество этажей.
    //Объявляет о результате и указывает застройщика.
    public static void main(String[] args) {
        Skyscrapers skyscrapers1 = new Skyscrapers();
        Skyscrapers skyscrapers2 = new Skyscrapers(50);
        Skyscrapers skyscrapers3 = new Skyscrapers("Wlad CO");
    }
}
class Skyscrapers {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public Skyscrapers() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Skyscrapers(int count) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + count);
    }

    public Skyscrapers(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }
}
