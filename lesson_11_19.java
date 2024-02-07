public class lesson_11_19 {
    //Класс, который описывает точку на плоскости x и y.
}
    //Вот как это бы сделал опытный Java-программист:
    //Код стал длиннее? Безусловно.
    //Зато в сеттеры и геттеры можно добавить валидацию параметров.
    //Например, можно следить за тем, чтобы x и y всегда были больше нуля (или не меньше нуля). Пример:
class Points {
    private int x;
    private int y;

    public Points(int x, int y) {
        this.x = Math.max(x, 0);
        this.y = Math.max(y, 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = Math.max(x, 0);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = Math.max(y, 0);
    }
}