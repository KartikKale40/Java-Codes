package DAY_5.Thread;

class A2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}

class B2 extends Thread{
    public void run(){
        for(int i=11;i<20;i++){
            System.out.println(i);
        }
    }
}

class C2 extends Thread{
    public void run(){
        for(int i=21;i<30;i++){
            System.out.println(i);
        }
    }
}


public class ThreadPriorityDemo {
    public static void main(String[] args) {
        A2 a = new A2();
        B2 b = new B2();
        C2 c = new C2();
        
        a.setPriority(10);
        a.setPriority(5);
        a.setPriority(1);

        a.start();
        try{
            a.join();
        }catch(Exception e){
            System.out.println(e);
        }
        b.start();
         try{
            b.join();
        }catch(Exception e){
            System.out.println(e);
        }
        c.start();
    }
}
