public class lesson_11_31 {
    //В алгоритме работы отельного лифта прописано: чтобы подняться с третьего этажа на шестой,
    //нужно проехать до четвертого, затем — до пятого и, наконец, — до шестого.
    //Но в нашей программе все этажи перепутались! Поэтому сейчас класс Hotel не компилируется.
    //Расставь поля класса в таком порядке, чтобы он компилировался и лифт ехал правильно.
}
class Hotel {
    public int thirdFloor = 3;
    public int fourthFloor = thirdFloor + 1;
    public int fifthFloor = fourthFloor + 1;
    public int sixthFloor = fifthFloor + 1;
}
