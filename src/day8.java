/*public class day8 {
    interface Employee{
        String Name();
        String id();
        String Salary();
    }
    static class BankEmployee implements Employee{
        @Override
        public String solveprogram(){
            System.out.println("solution");
            return "solution";
        }
    }
    static class checkingEmployee implements Employee{
        @Override
        public String work(){
            System.out.println("process");
            return "process";
        }
    }
    static void main(){
        BankEmployee Bank=new BankEmployee();
        BankEmployee
    }

}
public class Day7 {

    interface Employee {
        String Name();
        String id();
        String Salary();
    }

    static class BankEmployee implements Employee {

        @Override
        public String Name() {
            return "Ravi";
        }

        @Override
        public String id() {
            return "101";
        }

        @Override
        public String Salary() {
            return "50000";
        }

        public String solveprogram() {
            System.out.println("solution");
            return "solution";
        }
    }

    static class CheckingEmployee implements Employee {

        @Override
        public String Name() {
            return "Kumar";
        }

        @Override
        public String id() {
            return "102";
        }

        @Override
        public String Salary() {
            return "45000";
        }

        public String work() {
            System.out.println("process");
            return "process";
        }
    }*/

/*public class day8 {

    interface Employee {
        String Name();
        String id();
        String Salary();
    }

    static class BankEmployee implements Employee {

        @Override
        public String Name() {
            return "shree";
        }

        @Override
        public String id() {
            return "105";
        }

        @Override
        public String Salary() {
            return "45000";
        }

        public String solveprogram() {
            System.out.println("solution");
            return "solution";
        }
    }

    static class CheckingEmployee implements Employee {

        @Override
        public String Name() {
            return "SHREE";
        }

        @Override
        public String id() {
            return "102";
        }

        @Override
        public String Salary() {
            return "45000";
        }

        public String work() {
            System.out.println("process");
            return "process";
        }
    }

    public static void main(String[] args) {

        BankEmployee bank = new BankEmployee();

        System.out.println("Name : " + bank.Name());
        System.out.println("ID : " + bank.id());
        System.out.println("Salary : " + bank.Salary());
        bank.solveprogram();

        System.out.println();
        CheckingEmployee checking = new CheckingEmployee();

        System.out.println("Name : " + checking.Name());
        System.out.println("ID : " + checking.id());
        System.out.println("Salary : " + checking.Salary());
        checking.work();
    }
}*/
public class day8 {
    record courseRecord(String courseName, String department) {
    }
    static void main(){
        courseRecord courseRecord=new courseRecord("java","BSC CS");
        System.out.println(courseRecord.courseName());
        System.out.println(courseRecord.department());

    }
}




