import java.util.Calendar;

public class lesson_11_37 {
    //В классе lesson_11_37 есть поле currentYear,
    //которое должно инициализироваться значением текущего года(Calendar.getInstance().get(Calendar.YEAR))
    //при создании нового объекта типа Solution.
    //Тебе нужно найти ошибку и исправить её, чтобы при создании объекта класса Solution поле currentYear правильно инициализировалось.
    private int currentYear;

    public lesson_11_37() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        lesson_11_37 solution = new lesson_11_37();
        System.out.println(solution.getCurrentYear());
    }
}
