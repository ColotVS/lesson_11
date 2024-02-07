public class lesson_11_33 {
    //Наша задача — накормить ежика.
    //Нужно в методе main создать один объект Apple и один объект Hedgehog, у которого вызвать метод eat и передать нужный аргумент — яблоко.
    public static void main(String[] args) {
        Hedgehog.Apple apple = new Hedgehog.Apple();
        Hedgehog hedgehog = new Hedgehog();
        hedgehog.eat(apple);
    }
}

class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

static class Apple {

}
}
