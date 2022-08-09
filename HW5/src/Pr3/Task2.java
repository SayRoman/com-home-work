package Pr3;/* Write a program with two constant values, one with alternating
binary ones and zeroes, with a zero in the least-significant digit,
and the second, also alternating, with a one in the least-significant digit.
Combine these two values every way possible using the bitwise operators.
Display the results using.

 */



public class Task2 {
    public static void main(String[] args) {

        int a = 0x230;
        int b = 0x231;

        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("~a = " + Integer.toBinaryString(~a));
        System.out.println("~b = " + Integer.toBinaryString(~b));
        System.out.println("a & b = " + Integer.toBinaryString(a & b));
        System.out.println("b & a = " + Integer.toBinaryString(a & b));
        System.out.println("a | b = " + Integer.toBinaryString(a | b));
        System.out.println("a ^ b = " + Integer.toBinaryString(a ^ b));
        System.out.println("b ^ a = " + Integer.toBinaryString(b ^ a));
        System.out.println("a >> 1 = " + Integer.toBinaryString(a >> 1));
        System.out.println("a << 4 = " + Integer.toBinaryString(a << 4));
        System.out.println("a >>> 7 = " + Integer.toBinaryString(a >>> 7));
        System.out.println("-b >>> 4 = " + Integer.toBinaryString(-b >>> 4));
        System.out.println("-b >>> 1 = " + Integer.toBinaryString(-b >>> 1));
        System.out.println("-b = " + Integer.toBinaryString(-b));
    }
}
