public class lesson_11_10 {
    //Инициализация переменных
    //Как вы уже знаете, в вашем классе можно объявить несколько переменных класса, и не просто объявить,
    //а сразу инициализировать их стартовыми значениями.
    //Однако эти же переменные можно инициализировать и в конструкторе.
    //Поэтому теоретически возможна ситуация, когда одним и тем же переменным класса значения присваиваются дважды. Пример
    public static void main(String[] args) {
        Pet pet1 = new Pet("Барсик",3);     //Так можно: вызовется первый конструктор
        Pet pet = new Pet();                           //Так можно: вызовется второй конструктор
    }

}
class Pet
{
    public String name;
    public int age = -1;                                //Переменной age присваивается стартовое значение

    public Pet(String name, int age)
    {
        this.name = name;
        this.age = age;                                 //Стартовое значение перетирается
    }

    public Pet()                                        //Для age используется стартовое значение
    {
        this.name = "Безымянный";
    }

    //Вот что будет происходить при выполнении кода Pet pet1 = new Pet("Барсик",3);:
    //Создается объект типа Pet.
    //Инициализируются все переменные класса своими стартовыми значениями.
    //Вызывается конструктор и выполняется его код.
    //Т.е. переменные класса сначала инициализируются своими значениями, а уже затем выполняется код конструкторов.
}
