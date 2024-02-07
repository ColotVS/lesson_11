public class lesson_11_38 {
    //Попробуем собрать компьютер. У нас есть классы: системный блок, монитор, клавиатура, мышь.
    //В классе компьютер в конструкторе создай объекты классов-составляющих компьютера.
}
class Computer {
    Keyboard keyboard = new Keyboard();
    Monitor monitor = new Monitor();
    Mouse mouse = new Mouse();
    SystemUnit systemUnit=new SystemUnit();
}

class Keyboard {
}
class Monitor {
}
class Mouse {
}
class SystemUnit {
}
