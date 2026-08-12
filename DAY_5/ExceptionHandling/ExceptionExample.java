package DAY_5.ExceptionHandling;

class ZeroException extends Exception{
    String msg;
    public ZeroException(String msg){
        this.msg = msg;
    }

    public String getMessage(){
        return msg;
    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        int  i = 18;
        int j =0;

        try{
            int res = i/20;
            j = i /20;
            if(j ==0) throw new ZeroException("not accept zero value from ZeroExceptionClass");
        }catch(ZeroException e){
            System.out.println("Handle");
            System.out.println(e.getMessage());
        }
        System.out.println(j);

    }
}
