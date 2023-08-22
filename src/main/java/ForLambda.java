import java.util.*;

public class ForLambda {
    public static void main(String[] args) {
//        CounterEveryWord();
        SortingStrings();
    }

    private static void CounterEveryWord() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Map<String, Integer> wordCountMap = new HashMap<>();

        names.forEach(s -> {
            wordCountMap.put(s, wordCountMap.getOrDefault(s, 0) + 1);
        });

        wordCountMap.forEach((word, count) -> {
            System.out.println(word + ": " + count + " times");
        });
    }

    public static void SortingStrings(){
        List<String> strings = Arrays.asList("abc", "cba", "test", "hello");
        Collections.sort(strings, (String s1, String s2) -> s1.length() - s2.length());
//        {
//            System.out.println(strings);
//            if(s1.length() < s2.length())
//                return 1;
//            else if (s1.length() > s2.length())
//                return -1;
//            else return 0;
//        });
        System.out.println(strings);
    }
}
