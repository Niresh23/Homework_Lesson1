import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[20];
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++) {
            array[i] = "" + (int)(Math.random()*10);
        }
        for(int i = 0; i < array.length; i++) {
            int result = 0;
            if (map.get(array[i]) == null) map.put(array[i], 1);
            else {
                result = map.get(array[i]) + 1;
                map.put(array[i], result);
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(map);
    }
}
