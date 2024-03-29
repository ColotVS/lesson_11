public class lesson_11_18 {
    //Свойства: геттер и сеттер

    //В Java принято все поля класса делать private.
    //Только методы класса могут менять переменные класса,
    //и никакие методы из других классов не имеют доступа к переменным класса напрямую.

    //Если вы хотите, чтобы другие классы могли получать или менять данные внутри объектов вашего класса,
    //вы должны добавить в код вашего класса два метода — get-метод и set-метод. Пример:

}
class Person
{
    private String name;                //private-поле name

    public Person(String name)
    {
        this.name = name;               //Инициализация поля через конструктор
    }

    public String getName()             //getName()— метод возвращает значение поля name
    {
        return name;
    }

    public void setName(String name)    //setName()— метод изменяет значение поля name
    {
        this.name = name;
    }
}
    //Никакой другой класс не сможет изменить значение поля name напрямую.
    //Если кому-то нужно получить значение поля name, ему придется вызвать метод getName() у объекта типа Person.
    //Если какой-то код хочет поменять значение поля name, ему нужно будет вызвать метод setName() у объекта типа Person.
    //Метод getName() еще называют «геттер поля name», а  метод setName() — «сеттер поля name».
    //Это очень распространённый подход. В 80-90% всего Java кода вы никогда не увидите публичные переменные класса.
    //Вместо этого они будут объявлены private (ну или protected), и у каждой переменной будут публичные геттеры и сеттеры.
    //Этот подход делает код длиннее, но надежнее.
