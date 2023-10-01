public class testone {
    // Конструкторы
    public static void main(String[] args) {
        Humanx human1 = new Humanx("Bob");

    }
}

class Humanx {
    private String name;
    private int age;

    public Humanx() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Humanx(String name) {
        this.name = name;
        System.out.println("Привет из второго конструктора");
    }

    public Humanx(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Привет из третьего конструктора");
    }

}
