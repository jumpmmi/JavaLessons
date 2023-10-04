package FirstPartOfLessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Roma");
        person1.setAge(20);

        Person person2 = new Person();
        person2.setName("");
        person2.setAge(-5);
       
        System.out.println(person1.getName());
        

    }
}

class Person {
    // у класса могут быть:
    // 1. Данные(поля)
    // 2. Действия, которые он может совершать (методы)
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            name = username;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int userage) {
        if (userage < 0) {
            System.out.println("Введите положительное число");
        } else {
            age = userage;
        }

    }

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    void speak() {
        for (int i = 0; i < 3; i++)
            System.out.println("Меня зовут " + name + ", " + "мне " + age + " лет.");
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}