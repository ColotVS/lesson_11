public class lesson_11_25 {
    //Класс Object

    //Все классы в Java считаются унаследованными от класса Object. Это создатели Java так придумали.
    //А если некий класс унаследован от класса Object, в этом классе-наследнике появляются все методы класса Object.
    //Это и есть главный эффект наследования.
    //Другими словами, у каждого класса, даже если это не написано в его коде, есть все методы, которые есть у класса Object.
    //А среди таких методов есть методы, которые имеют отношение к сравнению объектов. Это метод equals() и метод hashCode().


}
class Persons
{
    String name;
    int age;
}
//Как будет на самом деле:
//class Persons extends Object
//{
//   String name;
//   int age;
//
//   public boolean equals(Object obj)
//   {
//      return this == obj;
//   }
//
//   public int hashCode()
//   {
//      return адрес_объекта_в_памяти;         //это дефолтная реализация, но может быть и другая
//   }
//}

//В примере выше мы создали простой класс Person с параметрами name и age, без единого метода.
//Однако, т.к. все классы считаются унаследованными от класса Object, у класса Person скрытно появились два метода:

//Метод	                        Описание
//boolean equals(Object obj)    Сравнивает текущий объект и переданный объект
//int hashCode()                Возвращает hash-code текущего объекта

//Получается, что методы equals есть у абсолютно всех объектов и можно сравнивать между собой объекты разных типов,
//и это все будет отлично компилироваться и работать.

//Код	                                Вывод на экран
//Integer a = 5;
//String s = "Привет";
//System.out.println(a.equals(s));      false
//System.out.println(s.equals(a));      false

//Object a = new Integer(5);
//Object b = new Integer(5);
//System.out.println(a.equals(b));       true
