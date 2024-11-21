package com.tiago.algorithms.string;

import com.tiago.algorithms.exercise.Exercise;

public class StringExercises implements Exercise {
    @Override
    public void executeAll() {
        reverseString();
        checkVowel();
        checkPalindrome();
        removeSpaces();
        removeFirstAndLast();
    }

    private static void reverseString(){
        String wordToReverse = "Hello";
        StringBuilder reversedWord =  new StringBuilder();
        int lengthOfWord = wordToReverse.length();

        System.out.println(" * Reverse String exercise:");

        if ( wordToReverse == null ) throw new IllegalArgumentException("Null is not a valid input");
        //percorrer todas as letras da wordToReverse de trás para a frente
        //Ciclo a começar no i = length até i = 0
        for (int i = lengthOfWord - 1; i >= 0; i--){
            reversedWord.append(wordToReverse.charAt(i));
        }

        System.out.println(reversedWord);
    }

    public static void checkVowel() {

        String wordToCheck = "Hello";
        boolean result = false;
        char[] vowels = {'a','e','i','o','u'};

        System.out.println(" * Checking Vowels Exercise:");
        //verificar se a palavra é diferente de null -> caso contrario mandar excepção
        if (wordToCheck == null) {
            throw new IllegalArgumentException("Cannot verify if word has vowel because it's null");
        }
        //percorrer a palavra wordToCheck do inicio ao fim
        //cada um dos characteres vai ser verificado para saber se é vogal
        //se algum caracter for um vogal então o result fica a true e saimos do ciclo
        /*
        for ( int i = 0; i < wordToCheck.length(); i++) {
            for(int j = 0; j < vowels.length; j++) {
                if (wordToCheck.charAt(i) == vowels[j]) {
                    result = true;
                    break;
                }
            }
        }*/

        result = wordToCheck.toLowerCase().matches(".*[aeiou].*");
        if (result) {
            System.out.println("On the word " + wordToCheck + " there is a vowel");
        } else {
            System.out.println("On the word " + wordToCheck + " there is not a vowel");
        }
    }

    private static void checkPalindrome() {

        //palavra igual da frente para tras
        // racecar por exemplo
        String word = "racecar";
        boolean isPalindrome = true;

        for (int i = 0; i < word.length()/2; i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The word " + word +" is palindrome? "+ isPalindrome);
    }

    private static void removeSpaces() {
        String stringWithSpaces = "hello world this is me";
        char[] characters = stringWithSpaces.toCharArray();
        StringBuilder outputString = new StringBuilder();

        for(char c : characters) {
            if(!Character.isSpaceChar(c)){
                outputString.append(c);
            }
        }

        System.out.println("String with no spaces: " + outputString);
    }

    private static void removeFirstAndLast() {
        String removeFirstAndLastSpace = " this is a com.tiago.algorithms.string ";

        removeFirstAndLastSpace = removeFirstAndLastSpace.strip();

        System.out.println("String with no spaces: " + removeFirstAndLastSpace);
    }
}
