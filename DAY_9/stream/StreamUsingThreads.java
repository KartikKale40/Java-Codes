package DAY_9.stream;

import java.util.*;

public class StreamUsingThreads {
    public static void main(String[] args) {
        int size =100;
        List<Integer> list =new ArrayList<>(size);

        Random random = new Random();
        for(int i=0;i<size;i++){
            list.add(random.nextInt(100));
        }
        
        long seqStart = System.currentTimeMillis();

        int resSeq =list.stream().map(n->{
            try{
            Thread.sleep(10);
            }catch(Exception e){

            }
            return n*2;
        }).mapToInt(n->n).reduce(0,(a,b)->a+b);

        long seqEnd = System.currentTimeMillis();

         long ParallelStart = System.currentTimeMillis();

        int resPar= list.parallelStream().map(n->{
            try{
            Thread.sleep(10);
            }catch(Exception e){

            }
            return n*2;
        }).mapToInt(n->n).reduce(0,(a,b)->a+b);

         long ParallelEnd = System.currentTimeMillis();

         System.out.println(resSeq+" "+resPar);
         System.out.println("Seq time for threads sleep method :"+(seqEnd-seqStart));
         System.out.println("parallel time for threads sleep method :"+(ParallelEnd-ParallelStart));
    }
}
