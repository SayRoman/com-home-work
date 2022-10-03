package pr5_2;

/*  1) Create a class.
    2) In the class define two fields: a - instance; b - static.
    3) In the class define two methods: a - instance; b - static.
    4) Access the fields from inside the main() method. Draw a conclusion.
        Note: main() is static by default.
    5) Call the methods from the main.
    6) Draw a conclusion. */

public class MainClass {

    public static void main(String[] args) {
        ClassForTask class2 = new ClassForTask();
        class2.fieldOne = 7;
        class2.fieldTwo = "Hello";
        //class2.methodOne();
        class2.methodTwo();
        //System.out.println(class2.methodOne());
        System.out.println(class2.methodTwo());
    }
}
