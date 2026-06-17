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

/*public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("thanvi");
        queue.add("tharun");
        queue.add("moni");
        queue.add("devi");
        queue.add("shree");
        while (!queue.isEmpty()) {
            process(queue);
        }
    }

    static void process(LinkedList<String> queue) {
        String removed = queue.removeFirst();
        System.out.println("Removed:" + removed);
    }
}
import java.util.LinkedList;
class Student{
    String name;
    int regno;
    int marks;
    Student(String name ,int regno,int marks){
        this.name=name;
        this.regno=regno;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return "Name:"+name+
                ",regno:"+regno+
                ", Marks:"+marks;
    }}*/

/*public class day10{
    static void main(){
        LinkedList<student>students=new LinkedList<>();
        students.add(new student("Aishu",101,85));
        students.add(new student("thanvi",102,90));
        students.add(new student("moni",103,87));
        students.add(new student("devi",104,78));
        students.add(new student("shree",105,89));
        System.out.println();
        for(student s:students){
            System.out.println(s);
        }
        students.removeFirst();
        System.out.println("\nAfter removing first student");
        for(student s:students){
            System.out.println(s);
        }
        String searchvalue="moni";
        for(student s:students) {
            if (s.name.equalsIgnoreCase(searchvalue)) {
                s.marks = 95;
                break;
            }
        }
        System.out.println("\nAfter updating moni's marks:");
        for(student s:students){
            System.out.println(s);

        }
    }
}*/

import java.util.LinkedList;
class Student{
    String name;
    int regno;
    int marks;
    Student(String name ,int regno,int marks){
        this.name=name;
        this.regno=regno;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return "Name:"+name+
                ",regno:"+regno+
                ", Marks:"+marks;
    }}
public class day10 {
    static void main() {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Aishu", 101, 85));
        students.add(new Student("thanvi", 102, 90));
        students.add(new Student("devi", 103, 87));
        students.add(new Student("shree", 104, 78));
        students.add(new Student("moni", 105, 89));
        System.out.println();
        for (Student s : students) {
            System.out.println(s);
        }
        students.removeFirst();
        System.out.println("\nAfter removing first student");
        for (Student s : students) {
            System.out.println(s);
        }
        String searchvalue = "moni";
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(searchvalue)) {
                s.marks = 95;
                break;
            }
        }
        System.out.println("\nAfter updating Ravi's marks:");
        for (Student s : students) {
            System.out.println(s);

        }
    }
}






