@FunctionalInterface
public interface IntFunc {
    int calc(int i);
}
class LambdaDemo{
    public static int sumByIntFunc(int[] arr, IntFunc func){
        int sum = 0;
        for (int item : arr) {
            sum += func.calc(item);
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] a = {12,34,6,7,4,0,9};
        System.out.println(sumByIntFunc(a, x -> x));
        System.out.println(sumByIntFunc(a, x -> x * x));
    }
}
