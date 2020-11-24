import java.util.*;

class MapUtils {

    public static void mapShare(Map<String, String> map) {
        // write your code here
        Map<String,String> res=new HashMap<>();

        if(map.containsKey("c")){
            map.remove("c");
        }
        if(map.containsKey("a")&&!map.get("a").isEmpty()){
            if(map.containsKey("b")){
                map.replace("b",map.get("a"));
            }
            else{
                map.put("b",map.get("a"));
            }
        }

    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] pair = s.split(":");
            map.put(pair[0], pair[1]);
        }
        MapUtils.mapShare(map);
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}