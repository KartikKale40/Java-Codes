package DAY_5.ExceptionHandling;

import java.util.Scanner;

class VoterException extends Exception{
    String msg;

    VoterException(String msg){
        this.msg = msg;
    }

    public String getMessage(){
        return msg;
    }
}


class VoterId{
    void apply(int age)throws VoterException{
        if(age >21){
            System.out.println("Apply for voter id.");
        }else throw new VoterException("Not Eligible for voter id.");
    }
}

public class VoterIdException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your age :");
        int age = sc.nextInt();

        VoterId v = new VoterId();
        try{
            v.apply(age);
        }catch(VoterException e){
            System.out.println(e.getMessage());
        }
    }
}
