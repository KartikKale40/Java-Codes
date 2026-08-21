package DAY_8.ComparatorInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Evenlist {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5,6,7,8,9,10,12,13,43,14);

        List<Integer> even = new ArrayList();
        List<Integer> odd = new ArrayList<>();

        for(Integer num:number){
            if(num%2==0){
                even.add(num);
            }else{
                odd.add(num);
            }
        }
        System.out.println("Print Even numbers :");
        for(Integer n: even){
            System.out.println(n+ " ");
        }
        System.out.println();
        System.out.println("Print odd numbers :");
        for(Integer n: odd){
            System.out.println(n+ " ");
        }

        List<Integer> listMul = new ArrayList<>();
        for(Integer n: number){
            listMul.add(n*2);
        }
        System.out.println("Printing multiplication of 2 :");
        for(Integer n:listMul){
            System.out.print(n+" ");
        }
        System.out.println("Sum of all numbers in numbers : ");
        List<Integer> sum = new ArrayList<>();
        

    }
}
