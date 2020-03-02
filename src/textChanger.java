import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class textChanger {
    public void wordConter(ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<>(list.size());
        for (int i = 0; i<list.size(); i++) {
            newList.add(i, list.get(i).replace(",", " ").replace(".", " ").replace("-", " "));
        }
        Collections.sort(newList);
        for (int i = 0; i<list.size(); i++) {

            System.out.println(newList.get(i));
        }
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Integer am;
        for (String i : list) {

            am = hm.get(i);
            hm.put(i, am == null ? 1 : am + 1);
        }
        System.out.println(hm);
        int maxValueInMap=(Collections.max(hm.values()));
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                System.out.println("» наш победитель - слово " + entry.getKey() + ", повторившеес€ "+entry.getValue()+ " раз!");
            }
        }


    }
}
