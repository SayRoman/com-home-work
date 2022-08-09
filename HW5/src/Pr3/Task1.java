package Pr3;// Get all special values for types float and double
// executing wrong operations.
// Try to compare values using this operations:
// -Infinity < -0.0 = 0.0 < Infinity

public class Task1 {
    public static void main(String[] args) {
        double negativeInfinity = - 1.0 / 0.0;
        double positiveInfinity = 1.0 / 0.0;
        float negativeInfinityF = - 1.0f / 0.0f;
        float positiveInfinityF = 1.0f / 0.0f;
        boolean negative = negativeInfinity < -0.0;
        boolean positive = 0.0 < positiveInfinity;
        boolean equal = negative == positive;

        System.out.println(negativeInfinity < -0.0);
        System.out.println(-0.0 == 0.0);
        System.out.println(0.0 < positiveInfinityF);
        System.out.println(equal);
    }
}
