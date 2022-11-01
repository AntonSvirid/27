package by.itstep.antonsvirid.model.entity;

//interface A {       // public + abstrack = по умолчанию
//    void test();
//}


public interface Eatable3 {
    int SIZE = 10;      // все поля по умолчанию статические и константные (public static final)


    static void test() {        // статические методы
        //...
    }

    public abstract void atest();       //абстрактное поведение - главное дл чего нужен интерфейс

    default void dtest() {      //      дефолтное поведение - черный  ход для dev JVM
        //...
    }

}
