public class lesson_11_06 {
    //Конструктор по умолчанию
    //Если вы хотите, чтобы объекты вашего класса создавались без каких-либо параметров,
    //вам нужно, чтобы у вашего класса был объявлен конструктор без параметров.

    //Конструктор без параметров — это не обязательно конструктор без кода, он вполне себе может содержать код,
    //который инициализирует переменные класса стартовыми значениями:
    public static void main(String[] args) {
        Dog dog1 = new Dog("Мухтар",8);     //Так можно: вызовется первый конструктор
        Dog dog2 = new Dog();                          //Так можно: вызовется второй конструктор
    }

}
class Dog
{
    public static final int UNKNOWN = -1;
    public String name;
    public int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Dog()
    {
        this.name = "Безымянный";
        this.age = UNKNOWN; // неизвестно
    }
}