package DAY_5.Thread;
class PrintValue extends Thread{
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

class PrintValue2 extends Thread{
    public void run(){
        for(int i =11;i<20;i++){
            try{
                Thread.sleep(1200);
                System.out.println(i);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class MultipleTHread {
    public static void main(String[] args) {
       
        PrintValue p = new PrintValue();
        PrintValue2 p2 = new PrintValue2();

        p.start();
        p2.start();
       
    }

}
