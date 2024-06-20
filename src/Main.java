import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String str1 = "rkqodlw";
        String str2 = "world";
        boolean result = scramble(str1, str2);
        System.out.println(result);
    }
        public static boolean scramble(String str1, String str2) {

            boolean rezult = true;
            Map <Character, Integer> map1 = new HashMap<>();
            Map <Character, Integer> map2 = new HashMap<>();

            for (char c : str1.toCharArray()) {
                if (map1.containsKey(c)) {
                    map1.put(c, map1.get(c) + 1);
                } else map1.put(c, 1);
            }
            for (char c : str2.toCharArray()) {
                if (map2.containsKey(c)) {
                    map2.put(c, map2.get(c) + 1);
                } else map2.put(c, 1);
            }

            for (char c: map2.keySet()){
                if (map1.containsKey(c) && map1.get(c) >= map2.get(c))
                    rezult =  true;
                else {
                    rezult =  false;
                    break;
                }
            }
            return rezult;
        }
    }

