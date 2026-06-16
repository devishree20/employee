import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.ArrayList;

public class day10 {
    static void main() {
        ArrayList<String> list = new ArrayList();
        list.add("moni");
        list.add("shree");
        list.add("thanvi");
        list.add("tharun");
        list.add("devi");
        System.out.println();
        list.remove("shree");
        list.add("Moni");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();



    }

}

