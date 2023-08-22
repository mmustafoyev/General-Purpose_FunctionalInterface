@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
class Lesson_1_2{
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(-5));
        Runnable run = ()-> System.out.println("hello");
    }
}
