public class lesson_11_34 {
    //У класса City есть два поля - название города и текущая температура воздуха.
    //Также в классе Solution есть метод showWeather: он выводит в консоли информацию о погоде в городе,
    //который передан в качестве аргумента метода.
    //Реализуй метод showWeather, который должен выводить в консоли информацию в таком формате:
    //В городе "название города" сегодня температура воздуха "температура в городе"
    //В методе main один раз нужно вызвать метод showWeather с нужным аргументом.

    public static void showWeather(City city) {
        System.out.printf("В городе %s сегодня температура воздуха %d%n", city.getName(), city.getTemperature());
    }

    public static void main(String[] args) {
        City city = new City("Dubai", 40);
        showWeather(city);
    }
}

class City {
    private String name;
    private int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }
}
