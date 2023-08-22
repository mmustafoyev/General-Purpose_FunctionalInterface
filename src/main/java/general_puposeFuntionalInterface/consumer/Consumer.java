package general_puposeFuntionalInterface.consumer;
@FunctionalInterface
public interface Consumer<T>{
    void accept(T t);
}
