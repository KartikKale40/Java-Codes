package DAY_10.methodRefandConstruc;

import java.util.Arrays;
import java.util.List;

class Product{
    int id;
    String name;

    public Product(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + "]";
    }
}

public class Demo3 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("");
    }
}
