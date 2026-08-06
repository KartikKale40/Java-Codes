public class loops {
    public static void main(String[] args) {
        // for(int i = 0 ;i <=10;i++){
        //     // if(i % 2 == 0){
        //     //     System.out.println(i);
        //     // }
        //     if(i == 9){
        //         break;
        //     }
        //     if (i==5) {
        //         continue;
        //     }
        //     System.out.println(i);

        // }

        // int i = 0 ;

        // while (i<=10) {
        //     System.out.println(i);

        //     if (i==8) {
        //         break;
        //     }
        //     if (i ==5) {
        //         continue;
        //     }
        // }

        // do{
        //     System.out.println(i);
        //     i++;

        //     if(i==8){
        //         break;
        //     }

        //     if (i==5) {
        //         continue;
        //     }

        // }while(i<=10);

        //DIVIDE PROGRAM :

        for(int i = 0; i<=10; i++){

            if(i%2 ==0 && i%4==0){
                System.out.println("FizzBizz");
            }

           else if (i % 4 ==0) {
                System.out.println("Bizz");
            } else if (i%2 ==0) {
                    System.out.println("Fizz");
            }else{
                System.out.println("Hellocls");
            }

        }

    }
}
