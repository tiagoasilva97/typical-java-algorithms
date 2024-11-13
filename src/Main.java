import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        reverseString();
        swapNumbers();
        checkVowel();
        checkPrime();
        checkFibonaci();
        printFibonaci(); // Check later
        checkOddNumbers();
        checkPalindrome();
        removeSpaces();
        removeFirstAndLast();
        sortingArray();
    }

    public static void reverseString(){
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

    public static void swapNumbers() {

        System.out.println(" * Swap Two Numbers Exercise:");

        int a = 2;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Starting number a = 2, b = 3. Now they are a = " + a + " and b = " + b );
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

    public static void checkPrime() {
        System.out.println(" * Checking for prime numbers");
        int numberToCheck = 2;
        boolean isPrime = true;

        // se um numero é divisivel por ele proprio e por 1, se for maior que 1, ou seja o resto da divisão
        if (numberToCheck == 0 || numberToCheck == 1) isPrime = false;
        for (int i = 1; i <= numberToCheck; i++) {
            if (numberToCheck % i == 0 && i != 1 && i != numberToCheck) {
                isPrime = false;
                break;
            }
        }

        System.out.println("Is number prime? " + isPrime);

    }

    public static void checkFibonaci() {
        System.out.println(" * Checking Fibonaci Exercise");
        int [] seq = {0,1,2,3,4,5}; //Not fibonaci
        //int [] seq = {0,1,1,2,3,5,8}; //fibonaci
        boolean isFibonaci = false;

        //percorrer a sequencia passando por todos as posições
        //verficar se pAtual = seq[pAtual-1] + seq[pAtual-2]
        for (int i = 2; i < seq.length; i++){
                if(seq[i] == sumTwoValues(seq[i-1], seq[i-2])){ isFibonaci = true;}
                else {isFibonaci = false;}
        }

        System.out.println("This sequence is fibonaci? " + isFibonaci);
        // Fibonaci é quando a sequencia de numeros é igual à soma dos dois ultimos numeros anteriores
    }

    public static int sumTwoValues(int a, int b){
        return a + b;
    }

    public static void printFibonaci(){
        System.out.println(" * Checking Fibonaci Exercise");
        int amountOfNumbers = 10;
        System.out.println("The fibonaci sequence:");
        for (int i = 1; i < amountOfNumbers; i++) {
            System.out.print(" " +sumTwoValues(i,i-1));
        }
    }

    public static void checkOddNumbers() {
        System.out.println();
        System.out.println(" * Checking Odd numbers Exercise");
        int [] numbersList = {2,4,6,8,5};
        boolean hasOddNumber = false;
        //percorrer uma lista de numeros
        //para cada numero verificar se o resto da divisão por 2 é diferente de 0
        // se isto acontecer é porque um dos numeros é impar
        for (int i : numbersList) {
            if(numbersList[i] % 2 != 0){
                hasOddNumber = true;
                break;
            }
        }

        System.out.println("The sequence has odd numbers? " + hasOddNumber);
    }

    public static void checkPalindrome() {

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

    public static void removeSpaces() {
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

    public static void removeFirstAndLast() {
        String removeFirstAndLastSpace = " this is a string ";

        removeFirstAndLastSpace = removeFirstAndLastSpace.strip();

        System.out.println("String with no spaces: " + removeFirstAndLastSpace);
    }

    public static void sortingArray() {
        System.out.println(" * Sorting Array Exercise");
        int [] numArray = {1,2,6,5,4};
        Arrays.sort(numArray);

        System.out.println("Sorted array: " + Arrays.toString(numArray));
    }
}