package DAY_6.Collection;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add("hello");
        list.add(23.54);
        list.add('c');

        System.out.println(list);
        int res =(int)list.get(1);
        System.out.println(res);

        String str = (String) list.get(6);
        System.out.println(str);

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(Object val :list){
            System.out.println(val);
        }

        list.add(2,80);
        System.out.println(list);

        // list.addFirst(2000);
        // System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println("using for each method :");
        list.forEach((Object o)->System.out.println(o));

        int size =list.size();
        System.out.println("Size of List is : "+size);

        
    }
}
