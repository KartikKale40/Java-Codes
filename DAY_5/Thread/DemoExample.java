package DAY_5.Thread;

class Counter{
    int count = 0;

   synchronized void increment(){
        count ++;
    }
}

class MyThread extends Thread{
    Counter counter;
    public MyThread(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i = 0; i<10000;i++){
            counter.increment();
        }
    }
}

public class DemoExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.count);
        MyThread myThread = new MyThread(counter);
        MyThread myThread2 = new MyThread(counter);
        myThread.start();
        myThread2.start();
        try{
            myThread.join();
            myThread2.join();
        }catch(Exception e){
        System.out.println(e);
    }
    System.out.println(counter.count);
}
}
