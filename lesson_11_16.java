public class lesson_11_16 {
    //Логирование
    //
    //Логированием называется запись в консоль или файл действий, которые происходят во время работы программы.
    //
    //Определить, что вызвался конструктор, довольно просто: нужно в теле конструктора написать в консоль сообщение об этом.
    //А вот как определить, что переменная инициализировалась?
    //
    //На самом деле это тоже не очень сложно: нужно написать специальный метод, который будет возвращать значение,
    //которым инициализируется переменная класса, и логировать этот факт. Вот как может выглядеть этот код:
    public static void main(String[] args)
    {
        ChildClass1 obj = new ChildClass1();                  //Создаем объект типа ChildClass
    }

    public static String print(String text)                 //Этот метод пишет в консоль переданный текст и возвращает его же
    {
        System.out.println(text);
        return text;
    }
}
class ParentClass1                                          //Объявляем ParentClass
{
    public String a = lesson_11_16.print("ParentClass.a");  //Пишем текст и им же инициализируем переменные
    public String b = lesson_11_16.print("ParentClass.b");

    public ParentClass1()
    {
        lesson_11_16.print("ParentClass.constructor");      //Пишем в консоль сообщение о вызове конструктора. Возвращаемое значение игнорируем.
    }
}

class ChildClass1 extends ParentClass1                       //Объявляем ChildClass
{
    public String c = lesson_11_16.print("ChildClass.c");   //Пишем текст и им же инициализируем переменные
    public String d = lesson_11_16.print("ChildClass.d");

    public ChildClass1()
    {
        lesson_11_16.print("ChildClass.constructor");       //Пишем в консоль сообщение о вызове конструктора. Возвращаемое значение игнорируем.
    }
}
