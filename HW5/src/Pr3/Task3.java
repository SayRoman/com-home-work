package Pr3;/* 1. Generate the output 4247 from the original StringBuilder
"0123456789" using all the methods from the list bellow:
- append;
- insert;
- delete;
- replace.

  2. Repeat the same task for String data type. Find out which
methods are not valid any more.
Use: string of methods call
 */

public class Task3 {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("0123456789");

        System.out.println(s);
        System.out.println(s.delete(0, 4));
        System.out.println(s.insert(1, 2));
        System.out.println(s.replace(2, 7, "4"));
        System.out.println(s.append(7));
        System.out.println();

        String str = "0123456789";
        //System.out.println(str);
        //System.out.println(str.append());
        //System.out.println(str.insert());
        //System.out.println(str.delete());
        //System.out.println(str.replace("0123456789", "4247"));
        System.out.println("Методы append, insert, delete - в классе String не действительны.\n" +
                "В отличие с классом StringBuilder.");


    }
}
