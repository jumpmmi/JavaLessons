import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        String path = "C:\\Users\\user\\Desktop\\Test.txt";                //путь к файлу
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){                      //цикл который будет считывать все строки с нашего файла
            System.out.println(scanner.nextLine());

        }
        scanner.close(); 
    }
}
