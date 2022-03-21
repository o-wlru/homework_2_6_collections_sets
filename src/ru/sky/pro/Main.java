package ru.sky.pro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("Весь", "сад", "в", "дожде", "Весь", "дождь", "в", "саду"));
        printEvenNumbers(nums);
        printSortedNumbersUp(nums);
        printUniqueWords(words);
        printDuplicateWord(words);
    }

    private static void printDuplicateWord(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.print("Повторяющихся слов: ");
        System.out.print(words.size() - uniqueWords.size());
    }

    private static void printUniqueWords(List<String> words) {
        System.out.print("Уникальные слова массива: ");
        Set<String> uniqueWords = new LinkedHashSet<>(words);
        System.out.print(uniqueWords);
        System.out.println("");
    }

    private static void printSortedNumbersUp(List<Integer> nums) {
        System.out.print("Четные члены последовательности в порядке возрастания: ");
        Set<Integer> sortedNumsUp = new TreeSet<>(nums);

        for (int num : sortedNumsUp) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("");
    }

    private static void printEvenNumbers(List<Integer> nums) {
        System.out.print("Нечетные члены последовательности в порядке возрастания: ");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("");
    }
}

