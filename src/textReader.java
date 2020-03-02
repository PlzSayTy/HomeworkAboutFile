import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class textReader {
    private ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> readFile(String path){
        File file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNext()){
                list.add(scanner.next());

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        return list;
    }
}
