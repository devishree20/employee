
public class day6 {
    static class Attributes {
        String Name;
        String regNo;
        String Dept;
        String Mathsmarks;
        String physicsmarks;
        String csemarks;


        Attributes() {
            System.out.println("Constructor called");
        }
        Attributes(String Name, String regNo, String Dept, String Mathsmarks,String physicsmarks,String csemarks ){
            this.Name =Name ;
            this.regNo= regNo;
            this. Dept= Dept;
            this.Mathsmarks=Mathsmarks;
            this.physicsmarks=physicsmarks;
            this.csemarks=csemarks;
        }

        void printDetails() {
            System.out.println("Attributes");
            System.out.println("Name:" +Name);
            System.out.println("regNo:"+regNo);
            System.out.println("Dept:"+Dept);
            System.out.println("Mathsmarks:" + Mathsmarks);
            System.out.println("physicsmarks:" +physicsmarks);
            System.out.println("csemarks:" + csemarks);
        }
    }

    public static void main(String[] args) {

    }
}
