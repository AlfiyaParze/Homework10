package geekbrains.homeworks.Homework10;

import java.util.*;

public class Homework10 {

    public static void main(String[] args) {
        makeWordsArray();
    }

    static void makeWordsArray() {
        ArrayList<String> wordsArray = new ArrayList<>(Arrays.asList(
                "word", "space space", "three", "space space", "five", null, "seven", null,
                "word", "eleven", null, "space space", null));                             //создаю массив слов

        System.out.println("Array's size is " + wordsArray.size() + " words.\n" + wordsArray + "\n"); //выводится весь массив слов

        Set<String> setWords = new HashSet<>(wordsArray); //makes hashset from array.

        setWords.forEach(setWord -> {
            System.out.println("Word '" + setWord + "' meets " + Collections.frequency(wordsArray, setWord) + " times.");
        }); // вывожу кол-во каждого уникального слова в массиве.
    }
}