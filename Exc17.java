package Exc17;

import java.util.HashMap;
import java.util.Map;

public class Exc17
{
    public static void main(String[] args)
    {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("Henning", "32");
        map1.put("Bent", "19");
        map1.put("Søren", "61");
        map2.put("Ida", "11");
        map2.put("Henning", "32");
        map2.put("Søren", "61");
        map2.put("Bent", "19");
        System.out.println(subMap(map1, map2));
    }

    private static boolean subMap (Map<String, String> map1, Map<String, String> map2)
    {
        for (Map.Entry<String, String> e1:map1.entrySet())
        {
            if (!map2.get(e1.getKey()).equals(e1.getValue()))
            {
                return false;
            }
        }
        return true;
    }
}
