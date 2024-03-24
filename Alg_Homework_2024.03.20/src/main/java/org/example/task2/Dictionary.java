package org.example.task2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dictionary {
    public static void main(String[] args) {

//  2) Постройте частотный словарь букв русского (или английского) алфавита (количество различных букв,
//  которые встречаются в тексте);

//  для решения можно использовать Array или HashMap (на ваше усмотрение).


        String text = "Mr and Mrs Dursley, of number four, Privet Drive, were proud to\n" +
                "say that they were perfectly normal, thank you very much. They\n" +
                "were the last people you’d expect to be involved in anything\n" +
                "strange or mysterious, because they just didn’t hold with such\n" +
                "nonsense.\n" +
                "Mr Dursley was the director of a firm called Grunnings, which\n" +
                "made drills. He was a big, beefy man with hardly any neck,\n" +
                "although he did have a very large moustache. Mrs Dursley was\n" +
                "thin and blonde and had nearly twice the usual amount of neck,\n" +
                "which came in very useful as she spent so much of her time craning\n" +
                "over garden fences, spying on the neighbours. The Dursleys had a\n" +
                "small son called Dudley and in their opinion there was no finer\n" +
                "boy anywhere.\n";

        System.out.println(letterDictionary(text));

        int[] letters = letterDictionary1(text);
        System.out.println(Arrays.toString(letters));
        for (int i = 0; i < letters.length; i++) {
            System.out.println((char)(i + 97) + " = " + letters[i]);
        }
    }

//  HashMap
    public static Map<Character, Long> letterDictionary(String text) {
        Map<Character, Long> dictionary = Arrays.stream(text.split("\\W+"))
                .map(String::toLowerCase)
                .flatMapToInt(String::chars)
                .mapToObj(letter -> (char) letter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return dictionary;
    }

//  Array
    public static int[] letterDictionary1(String text) {
        text = text.toLowerCase();
        int[] letters = new int[26];
        for (int i = 0; i < text.length(); i++) {
            int codePoint = text.codePointAt(i);
            if (96 < codePoint && codePoint < 123 ) {
                letters[codePoint - 97] += 1;
            }
        }

        return letters;
    }


}


