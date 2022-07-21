import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        String zodiac = "";
        String animal = "";
        int month;
        int day;
        int year;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter day your birthday (1 - 31): ");
        day = s.nextInt();
        System.out.print("Enter month your birthday (1 - 12): ");
        month = s.nextInt();
        System.out.print("Enter year your birthday: ");
        year = s.nextInt();

        /* Capricorn 21st December - 19th January (Козерог);
           Aquarius 20th January - 18th February (Водолей);
           Pisces 19th February - 20th March (Рыбы);
           Aries 21th March - 19th April (Овен);
           Taurus 20th April - 20th May(Телец);
           Gemini 21th May - 21th June (Близнецы);
           Cancer 22th June - 22th July (Рак);
           Leo 23th July - 22th August (Лев);
           Virgo 23th August - 22th September (Дева);
           Libra 23th September -22th October (Весы);
           Scorpio 23th October - 21th November (Скорпион);
           Sagittarius 22th November - 21th December (Стрелец);
        */

        if ((month == 12) && (day >= 22) || (month == 1) && (day <= 20)) {
            zodiac = "Capricorn";
        } else if((month == 1) || (month == 2) && (day <=19)) {
            zodiac = "Aquarius";
        } else if((month == 2) || (month == 3) && (day <=20)) {
            zodiac = "Pisces";
        } else if((month == 3) || (month == 4) && (day <=19)) {
            zodiac = "Aries";
        } else if((month == 4) || (month == 5) && (day <=21)) {
            zodiac = "Taurus";
        } else if((month == 5) || (month == 6) && (day <=21)) {
            zodiac = "Gemini";
        } else if((month == 6) || (month == 7) && (day <=23)) {
            zodiac = "Cancer";
        } else if((month == 7) || (month == 8) && (day <=23)) {
            zodiac = "Leo";
        } else if((month == 8) || (month == 9) && (day <=23)) {
            zodiac = "Virgo";
        } else if((month == 9) || (month == 10) && (day <=23)) {
            zodiac = "Libra";
        } else if((month == 10) || (month == 11) && (day <=22)) {
            zodiac = "Scorpio";
        } else if(month == 12) {
            zodiac = "Sagittarius";
        }

        int n = (1997 - year) % 12;
        if ((n == 1) || (n == -11)) {
            animal = "Rat";
        } else {
        if (n == 0) {
          animal = "Ox";
        }
        if ((n == 11) || (n == -1)) {
          animal = "Tiger";
        }
          else {
        if ((n == 10) || (n == -2)) {
          animal = "Rabbit";
        }
          else {
        if ((n == 9) || (n == -3)) {
          animal = "Dragon";
        }
          else {
        if ((n == 8) || (n == -4)) {
          animal = "Snake";
        }
          else {
        if ((n == 7) || (n == -5)) {
          animal = "Horse";
        }
          else {
        if ((n == 6) || (n == -6)) {
          animal = "Sheep";
        }
          else {
        if ((n == 5) || (n == -7)) {
          animal = "Monkey";
        }
          else {
        if ((n == 4) || (n == -8)) {
          animal = "Chicken";
        }
          else {
        if ((n == 3) || (n == -9)) {
          animal = "Dog";
        }
          else {
        if ((n == 2) || (n == -10)) {
          animal = "Pig";
        }}}}}}}}}}}

        System.out.println("Your zodiac sign: " + zodiac);
        System.out.println("Your animal year: " + animal);
    }
}
