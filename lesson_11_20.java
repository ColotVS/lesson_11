public class lesson_11_20 {
    //Ты сделал предзаказ на новенькую Bugatti ровно полгода назад.
    //Сейчас июнь, и было бы неплохо все-таки ездить на кабриолете. Но ты забыл, в каком кузове заказывал машину.
    //Твоя задача — добавить функциональность для получения текущей конфигурации и изменения её при необходимости.
    //Для этого создай геттеры и сеттеры.

}
class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body=body;
    }
}
