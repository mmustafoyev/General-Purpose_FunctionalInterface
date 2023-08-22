package general_puposeFuntionalInterface.function;
@FunctionalInterface
public interface BiFunction<T, V, R> {
    R apply(T t, V v);
}
