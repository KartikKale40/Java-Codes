package DAY_5.ExceptionHandling;

import java.util.Scanner;

class AppointmentException extends Exception{
    String msg;
    AppointmentException(String msg){
        this.msg = msg;
    }

    public String getMessage(){
        return msg;
    }
}

class Hospital{
    void bookAppointment(int slot)throws AppointmentException{
        int A_slots = 3;

        if(slot < A_slots){
            System.out.println("Appointment Book Successfully..");
        }else throw new AppointmentException("No appointment slots are available");
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int slots =0;
        System.out.println("Do You want book appointment(Yes or no)");
        String op = sc.nextLine();
        op = op.toLowerCase(); 

         if(op.equals("yes")){ 
            slots += 1; 
             Hospital h = new Hospital(); 
            try {
                h.bookAppointment(slots); 
            } catch (AppointmentException e) {
                System.out.println(e.getMessage());
            }
        } 
        
    }
}
