    public class Palindrome {
        public static void main(String[] args) {
            int num = 121;
            int org  = num;
            int rev =0;

            while (num !=0) {
                int rem = num % 10;
                rev = rev * 10 +rem;
                num = num/10;
                
            }

            if (rev == org) {
                System.out.println("Palindrom");
                
            }else{
                System.out.println("NOt");
            }
        }
    }
