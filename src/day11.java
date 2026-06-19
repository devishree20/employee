/*import java.util.HashSet;
import java.util.Set;
public class day11 {
   public static void main(String[]args){
       Set<String> set = new HashSet<>();
       set.add("moni");
       set.add("shree");
       set.add("thanvi");
       set.add("savi");
       System.out.println("set");
       for (String s:set){
           System.out.println(s);

       }

   }
}*/

import java.util.HashMap;
import java.util.Map;

public class day11{
    public static void main(){
       Map<String, Object> person = new HashMap<>();
     person.put("name", "saran");
        person.put("age", 18);
        person.put("isOld", false);
        person.put("percent", 79.677);

        System.out.println(person.get("percent"));
        person.entrySet().forEach(entry ->{
        System.out.println(entry.getKey() + " : " + entry.getValue());
        });
        }

        }


