import java.util.Objects;

public class lesson_11_28 {
    //Метод hashCode()

    //Кроме метода equals, который выполняет детальное сравнение всех полей обоих объектов,
    //есть еще один метод, который может использоваться для неточного, но очень быстрого сравнения — hashCode().

    //Если его вызвать у объекта, то он вернет некое число — аналог первой буквы в слове. Это число обладает такими свойствами:
    //У одинаковых объектов всегда одинаковые hash-code
    //У разных объектов могут быть одинаковые hash-code, а могут быть разные
    //Если у объектов разные hash-code, объекты точно разные

    //Для большего понимания перепишем эти свойства относительно слов:
    //У одинаковых слов всегда одинаковые первые буквы
    //У разных слов могут быть одинаковые первые буквы, а могут быть и разные
    //Если у слов разные первые буквы, слова точно разные

    //Последнее свойство и используется для ускоренного сравнения объектов:
    //Сначала у двух объектов вычисляются hash-code. Если эти hash-code разные, то объекты точно разные, и сравнивать их дальше не нужно.
    //А вот если hash-code одинаковые, придется все же сравнивать объекты с помощью equals.

    //Напиши свою реализацию hashCode, используя переменные model и year.
    //Если эти поля у двух объектов одинаковые, то должен возвращаться одинаковый hashCode.
    //Если правильно реализовать метод hashCode, вывод должен быть таким:
    //true
    //true
    //true
    //true
    //false
    //false

    public static void main(String[] args) {
        Care lamborghini = new Care("Lamborghini", 2020);
        Care lamborghini1 = new Care("Lamborghini", 2020);
        Care ferrari = new Care("Ferrari", 2020);
        Care ferrari1 = new Care("Ferrari", 2020);
        Care bugatti = new Care("Bugatti", 2020);
        Care bugatti1 = new Care("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
class Care {
    private String model;
    private int year;

    public Care(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}
