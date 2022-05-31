package kotl.functional_programming.lymbdas;

import java.util.function.Function;

public class Test1 {
    public static Function<Integer, Integer> square = x -> x*x;


    public static void main(String[] args) {
        System.out.println(square.apply(4));

    }
}
