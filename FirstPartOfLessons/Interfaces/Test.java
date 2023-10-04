package FirstPartOfLessons.Interfaces;       

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Tom");
        outputInfo(animal1);
        outputInfo(person1);
    }

    public static void outputInfo(Info info){                //реализация интерфейса Инфо
        info.showInfo();
    }
}
