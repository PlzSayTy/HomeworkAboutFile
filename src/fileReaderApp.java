import java.util.Scanner;

public class fileReaderApp {
    public static void main(String[] args){
        System.out.println("Введите путь к файлу");
        Scanner in = new Scanner(System.in);
        textReader tr = new textReader();
        textChanger tc = new textChanger();
        tc.wordConter(tr.readFile(in.nextLine()));

    }
}
