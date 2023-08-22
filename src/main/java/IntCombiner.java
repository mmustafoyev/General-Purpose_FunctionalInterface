import java.util.Arrays;

@FunctionalInterface
interface IntCombiner {
    int combine(int a, int b);

    default int combineArray(int[] array) {
        int result = 0;
        if (array.length == 1) {
            result = array[0];
        } else if (array.length == 2) {
            result = combine(array[0], array[1]);
        } else if (array.length > 2) {
            result = combineAll(array[0], array[1], Arrays.copyOfRange(array, 2, array.length));
        }
        return result;
    }

    static IntCombiner sum(){
        return (a, b) -> a + b;
    }
    //instead of that
//    static IntCombiner sum() {
//        return new IntCombiner() {
//            @Override
//            public int combine(final int a, final int b) {
//                return a + b;
//            }
//        };
//    }

    private int combineAll(int a, int b, int... other) {
        int result = combine(a, b);
        for (int i : other) {
            result = combine(result, i);
        }
        return result;
    }
}



class Lesson_1_1 {
    public static void main(String[] args) {
        int[] ints = {2, 1, 4, 7, 4, 2};
        int result = IntCombiner.sum().combineArray(ints);
        System.out.println(result);
    }
}