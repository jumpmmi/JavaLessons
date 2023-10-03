public class Lesson24 {                 //переопределение класса toString
    public static void main(String[] args) {
        Human24 h1 = new Human24("Artsiom", 25);
        System.out.println(h1);

    }
}

class Human24 {
    private String name;
    private int age;

    public Human24(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {                  // <<<<<<<<-----------
        return name + " " + age;
    }
}