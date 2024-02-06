public class lesson_11_17 {
    //Эта задача нужна для понимания того, как вызывается конструктор базового класса (родителя).
    //У тебя есть классы ElectricCar, GasCar, HybridCar, которые наследуют класс Car.
    //Тебе нужно в конструкторах наследников класса Car передать тип автомобиля в конструктор базового класса (родителя),
    //используя super("тип автомобиля").
    //Для этого в классе Solution в методе main создай 3 объекта: HybridCar, GasCar и ElectricCar.
    public static void main(String[] args) {
        new ElectricCar();
        new GasCar();
        new HybridCar();
    }
}
class Car {

    public Car(String type) {
        System.out.println("Привет. Я " + type);
    }
}

class GasCar extends Car {
    public GasCar() {
        super("GasCar");

    }
}
class HybridCar extends Car {
    public HybridCar() {
        super("HybridCar");
    }
}
class ElectricCar extends Car {
    public ElectricCar() {
        super("ElectricCar");
    }
}
