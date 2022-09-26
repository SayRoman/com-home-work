package Task1;

public class Employer {

    public String name;
    public String surname;
    public String nameOfFather;

    public Employer (String name, String surname, String nameOfFather){
        this.name = name;
        this.surname = surname;
        this.nameOfFather = nameOfFather;
    }

    @Override
    public String toString() {
        return "Фамилия: " + surname + " Имя: " + name + " Отчество: " + nameOfFather;
    }
}
