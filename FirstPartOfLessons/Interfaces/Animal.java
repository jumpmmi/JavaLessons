package FirstPartOfLessons.Interfaces;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I am sleping");
    }

    public void showInfo() {
        System.out.println("Id is: " + id);
    }

}
