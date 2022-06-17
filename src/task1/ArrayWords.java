package task1;

import java.util.*;

public class ArrayWords {

    public static void main(String[] args) {

        List<String> filledArray = Arrays.asList("Bavaria","Munich","Hamburg","Wiesbaden","Munich","Berlin","Hamburg","Hesse");
        System.out.println("Изначальный список:");
        filledArray.forEach(System.out::println);

        System.out.println("\nСписок сводка: ");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : filledArray) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);

        System.out.println("\nСписок уникальных слов: ");
        Set<String> unique = new HashSet<>(filledArray);
        unique.forEach(System.out::println);
    }
}
