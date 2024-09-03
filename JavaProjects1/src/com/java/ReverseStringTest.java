package com.java;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {

    public static String reverseSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    @Test
    public void testReverseSentenceEmptyString() {
        assertEquals("", reverseSentence(""));
    }

    @Test
    public void testReverseSentenceOneWord() {
        assertEquals("world", reverseSentence("dlrow"));
    }

    @Test
    public void testReverseSentenceMultipleWords() {
        assertEquals("olleh dlrow", reverseSentence("hello world"));
    }

    @Test
    public void testReverseSentenceWithSpecialCharacters() {
        assertEquals("dcba !dlrow ,olleh", reverseSentence("abcd world, hello!"));
    }

    public static void main(String[] args) {
        String inputSentence = "Hello world!";
        String reversedSentence = reverseSentence(inputSentence);
        System.out.println("Original: " + inputSentence);
        System.out.println("Reversed: " + reversedSentence);
    }
}