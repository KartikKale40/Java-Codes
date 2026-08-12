package DAY_5.Thread;

class A extends Thread{
    public void run(){
        
        for(int i =0;i<10;i++){
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}


public class Demo {
    public static void main(String[] args) {
        Thread t = new Thread();
        A a = new A();
        a.start();
        a.setName("thread class thread");
        System.out.println(t.currentThread().getName());
        System.out.println(a.getName());


    }
}
