package New;

import java.sql.SQLOutput;

public class New {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.Name = "Alex";
        person1.age = 22;
        int year1 = person1.calculateYearsToRetirement();


        Person person2 = new Person();
        person2.Name = "Max";
        person2.age = 20;
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии "+year1+" лет.");
        System.out.println("Второму челеловеку до пенсии "+year2+" лет.");
        System.out.println("тестирую git");
    }

}

class Person {
    String Name;
    int age;

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;

    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Привет, меня зовут " + Name + ", мне " + age + " лет.");
        }
    }
}