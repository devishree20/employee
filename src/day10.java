import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

/*public class day10 {
    static void main() {
        ArrayList<String> list = new ArrayList();
        list.add("moni");
        list.add("shree");
        list.add("thanvi");
        list.add("tharun");
        list.add("devi");
        System.out.println();
        list.remove("shree");
        list.add("shree");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();


    }
}*/

public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("thanvi");
        queue.add("tharun");
        queue.add("moni");
        queue.add("devi");
        queue.add("shree");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }
}