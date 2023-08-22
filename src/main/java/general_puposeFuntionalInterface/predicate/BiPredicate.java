package general_puposeFuntionalInterface.predicate;

@FunctionalInterface
public interface BiPredicate<T,U> {
    boolean test(T t, U u);
}
