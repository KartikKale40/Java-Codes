package DAY_4;

public class Test {
    
    public static void main(String[] args) {
        
       int[] num = {1,2,3,4,5,6};

       for(int i =0;i<=num.length;i++){
        System.out.println("Array Elemrnts :"+i);
       }

       System.out.println("Array Element at 0 index is :"+num[0]);

       System.out.println("Before Updating value at 2 index :"+num[2]);
       int a = num[2]=55;
       System.out.println("Updating value at 2 index :"+a);

     }
}
