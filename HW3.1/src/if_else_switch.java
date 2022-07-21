import java.util.Scanner;

public class if_else_switch {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите направление вашего движения (вверх/вниз/влево/вправо): ");
        String a = s.nextLine();

        switch (a) {
            case ("вверх"): {
                System.out.println("Вы зашли в лес и перед ваши лежат три предмета: Камень, Ножницы, Бумага. Что выберете?: ");
            }
            break;
        }



    }
}
