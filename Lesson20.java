public class Lesson20 { // Конструкторы
    public static void main(String[] args) {
        Human20 Human1 = new Human20("Bob",15);

    }
}

class Human20 {
    private String name;
    private int age;

    public Human20() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Human20(String name) {
        this.name = name;
        System.out.println("Привет из второго конструктора");
    }

    public Human20(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Привет из третьего конструктора");
    }

}

