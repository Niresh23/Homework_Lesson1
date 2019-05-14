import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    HashMap<String, String> map = new HashMap<>();

    public void add(String suname, String number) {
        if(map.get(suname) == null) map.put(suname, number);
        else {
            String buff = map.get(suname);
            map.put(suname, buff + ", " + number);
        }
    }

    public String get(String suname) {
        String result = "";
        result = suname + " " + map.get(suname);

        return result;
    }

}
