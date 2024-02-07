public class lesson_11_23 {
    //Сборка мусора

    //Фрагментация памяти

    //Еще один важный момент, связанный с удалением объектов — фрагментация памяти.
    //Если постоянно создавать и удалять объекты, скоро вся память будет вперемешку:
    //области занятой памяти будут постоянно перемежаться пустыми областями.

    //И легко может случиться ситуация, когда мы не можем создать большой объект (например, массив на миллион элементов),
    //потому что нет большого куска свободной памяти.
    //Т.е. свободная память вроде и есть, и много, но вот большого цельного куска свободной памяти может и не быть

    //Оптимизация (дефрагментация) памяти

    //Java-машина решает эту проблему специфическим образом. Выглядит это примерно так:
    //Память делится на две части. Все объекты создаются (и удаляются) только в одной ее половине.
    //Когда наступает время убрать дырки в памяти, все объекты из первой половины копируются во второю половину.
    //Но копируются уже вплотную друг другу, чтобы дыр не было.
}
