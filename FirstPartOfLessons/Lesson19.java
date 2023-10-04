package FirstPartOfLessons;
public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human("Bob",15);
       // human1.setName("Artsion");
       // human1.setAge(24);
       // human1.getInfo();
    }

}

class Human {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name + "," + age);
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Привет из третьего конструктора");
    }
}