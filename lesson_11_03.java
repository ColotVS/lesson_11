public class lesson_11_03 {
    //Конструктор
    //при создании объекта часто в него передаются какие-то параметры.
    //Причем в некоторые объекты параметры передаются, а в некоторые — нет. Как вообще работает весь этот механизм с параметрами?

    //У каждого класса есть специальный метод (или методы),
    //которые отвечают за обработку параметров при создании объекта. Такие методы называются конструкторы.

    //Отличить метод-конструктор от обычного метода в коде несложно. Такой метод обладает двумя особенностями:

    //Имя метода-конструктора совпадает с именем его класса (и начинается с большой буквы)
    //Метод-конструктор не имеет типа возвращаемого результата.

    //Общий вид его обычно такой:
    //модификаторы Класс(параметры)
    //{
    //   код
    //}
    public static void main(String[] args)
    {
        Point point = new Point(5, 10);
    }
}

class Point             //Класс Point
{
    public int x;
    public int y;

    Point(int x, int y) //Конструктор класса Point
    {
        this.x = x;
        this.y = y;
    }
    //Обратите внимание, как выглядит метод-конструктор: у него нет типа-результата и его имя совпадает с именем-класса.
    //И еще один момент: посмотрите на код внутри конструктора.
    //Переменные-параметры конструктора имеют те же имена, что и поля класса – x, y.
    //Это стандартная практика, чтобы не выдумывать названия переменных.
    //Берутся те же имена, что у полей класса, а конфликт имен решается с помощью ключевого слова this.
}
