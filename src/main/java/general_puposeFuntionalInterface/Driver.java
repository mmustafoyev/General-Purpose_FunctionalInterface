package general_puposeFuntionalInterface;

import general_puposeFuntionalInterface.consumer.BiConsumer;
import general_puposeFuntionalInterface.consumer.Consumer;
import general_puposeFuntionalInterface.function.BiFunction;
import general_puposeFuntionalInterface.function.Function;
import general_puposeFuntionalInterface.function.variatOfFunction.BinaryOperator;
import general_puposeFuntionalInterface.function.variatOfFunction.UnaryOperator;
import general_puposeFuntionalInterface.predicate.BiPredicate;
import general_puposeFuntionalInterface.predicate.Predicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        Supplier<ArrayList<String>> supList = () -> new ArrayList<>(List.of("hi", "mine"));
        System.out.println(supList.get());
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Functional interfaces in Java");
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> mapped = (i, s) -> map.put(i, s);
        mapped.accept(1, "one");
        mapped.accept(2, "two");
        System.out.println(map);
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(4));
        System.out.println(isPositive.test(-5));
        BiPredicate<String, String> equal = (s, d) -> s.equals(d);
        System.out.println(equal.test("ttr", " ttr"));
        System.out.println(equal.test("ttr", "ttr"));
        System.out.println(equal.test("tt", " ttr"));
        Function<String, String> func = s -> s.toUpperCase();
        System.out.println(func.apply("ASDasSfFewRWRfT"));
        BiFunction<String, String, String> func1 = (s1, s2) -> s1.concat(s2);
        System.out.println(func1.apply("aaalll", "bbbbbt"));
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(9));
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(4,92));
    }
}
