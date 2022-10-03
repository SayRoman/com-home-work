package pr5_1;

/* Create wrapper class objects using different approaches
(constructor, literals). Create code that uses a xxxValue() method,
a parseXxx() method, and a valueOf() method.
 */

public class MainClass {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        MethodClassXxxValue xxxValue = new MethodClassXxxValue();
        System.out.print("Преобразование в byte: ");
        System.out.println(xxxValue.xByte);
        System.out.print("Преобразование в short: ");
        System.out.println(xxxValue.xShort);
        System.out.print("Преобразование в int: ");
        System.out.println(xxxValue.xInt);
        System.out.print("Преобразование в float: ");
        System.out.println(xxxValue.xFloat);
        System.out.print("Преобразование в double: ");
        System.out.println(xxxValue.xDouble);
        System.out.println();
        System.out.print("Введите целое число: ");
        MethodClassParseXxx parseXxx = new MethodClassParseXxx();
        System.out.print("Преобразование в byte: ");
        System.out.println(parseXxx.xxByte);
        System.out.print("Преобразование в short: ");
        System.out.println(parseXxx.xxShort);
        System.out.print("Преобразование в int: ");
        System.out.println(parseXxx.xxInt);
        System.out.print("Преобразование в float: ");
        System.out.println(parseXxx.xxFloat);
        System.out.print("Преобразование в double: ");
        System.out.println(parseXxx.xxDouble);
        System.out.println();

    }
}
