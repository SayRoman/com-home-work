package homeWork.Pr7.first;

public class MainCurrentTimeMillis {
    public static void main(String[] args) {
        MainCurrentTimeMillis task1 = new MainCurrentTimeMillis();
        int a = 1;
        Integer b = 1;

        System.out.println("Примитывный тип данных int");
        System.out.println(task1.countPrimitiv(a));
        System.out.println(System.currentTimeMillis());
        System.out.println();
        System.out.println("Класс-оболчка тип данных Integer");
        System.out.println(task1.countInteger(b));
        System.out.println(System.currentTimeMillis());


    }

    public int countPrimitiv(int a) {
        int sumA = 0;
        for (int i = 0; i < 1000000; i++) {
            sumA = i + 1;

        }
        return sumA;
    }

    public Integer countInteger(Integer a) {
        int sumA = 0;
        for (int i = 0; i < 1000000; i++) {
            sumA = i + 1;

        }
        return sumA;
    }
}
