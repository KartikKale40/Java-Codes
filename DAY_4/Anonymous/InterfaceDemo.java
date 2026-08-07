package DAY_4.Anonymous;

interface Emp  {
    int sal(int sal);
}

// class Dev implements Emp{
//     public int sal(int sal){
//        return sal+5000;
//     }
// }

// class Tester implements Emp{
//      public int sal(int sal){
//        return sal+2000;
//     }
// }



public class InterfaceDemo {
    public static void main(String[] args) {
        // Dev d = new Dev();
        // System.out.println("Salary of Developer is :"+d.sal(30000));

        Emp dev = new Emp(){
            public int sal(int sal){
                return sal+5000;
            }
        };
        System.out.println("40000");
    }
}
