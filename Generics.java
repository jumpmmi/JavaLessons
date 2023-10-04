import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        ///////////////////////// JAVA 5 ///////////////////////
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(1);
        System.out.println(animal);

        ////////////// C ИСПОЛЬЗОВАНИЕМ ДЖЕНЕРЕКОВ 
        ////////////// ///////////////////

        List<String> animals2 = new ArrayList<String>();
        animals2.add("Dog");
        animals2.add("Cat");
        animals2.add("Frog");
        String animal2 = animals2.get(1);
        System.out.println(animal2);

        //////////// JAVA 7 (сейчас)
         List<String> animals3 = new ArrayList<>();           //в правой части не нужно указывать опять что это тип стринг
        animals3.add("Dog");
        animals3.add("Cat");
        animals3.add("Frog");
        String animal3 = animals2.get(1);
        System.out.println(animal3);

    }
}

class Animal {

}