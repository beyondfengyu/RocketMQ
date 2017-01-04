import java.util.HashMap;
import java.util.Set;

/**
 * @author beyond
 * @version 1.0
 * @date 2016/12/19
 */
public class TestTmp {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("kill", null);

        System.out.println("kill:" + map.get("kill"));

        map.put(null, "ddd");

        System.out.println("null:" + map.get(null));
        System.out.println("null:" + map.containsKey(null));
        Set<String> set = null;
        for (String key : set) {
            
        }
    }
}
