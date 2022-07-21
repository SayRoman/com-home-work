import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите размер: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt() - 1;
//1-й вариант Ромб
        for (int i = 0; i < rows; i++){

            //Левое пустое пространство
            for (int j = rows; j > i; j--){
                System.out.print(" ");
            }

            //Левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++){ //Здесь можно изменить счётчик или поставить равенство с внешним счётчиком что бы пирамидка была остроугольная
                System.out.print("*");
            }

            //Правая часть треугольника
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }

            //Правое пустое пространство
            for (int j = rows; j > i; j--){
                System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = rows; i >= 0; i--){ //Заменили всего одну строку и поменяли знак >= Что бы Ромб был острый

            //Левое пустое пространство
            for (int j = rows; j > i; j--){
                System.out.print(" ");
            }

//            //Левая часть треугольника
            for (int j1 = 0; j1 <= i; j1++){ //Здесь можно изменить счётчик или поставить равенство с внешним счётчиком что бы пирамидка была остроугольная
                System.out.print("*");
            }

            //Правая часть треугольника
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }

            //Правое пустое пространство
            for (int j = rows; j > i; j--){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
