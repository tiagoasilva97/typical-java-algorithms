package math;
import exercises.Exercise;

public class MathExercises implements Exercise {

    @Override
    public void executeAll() {
        swapNumbers();
        checkPrime();
        checkFibonaci();
        printFibonaci();
        checkOddNumbers();
    }

    private void swapNumbers() {
        System.out.println(" * Swap Two Numbers Exercise:");

        int a = 2;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Starting number a = 2, b = 3. Now they are a = " + a + " and b = " + b );
    }

    private static void checkPrime() {
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

    private static void checkFibonaci() {
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

    private static void printFibonaci(){
        System.out.println(" * Checking Fibonaci Exercise");
        int amountOfNumbers = 10;
        System.out.println("The fibonaci sequence:");
        for (int i = 1; i < amountOfNumbers; i++) {
            System.out.print(" " +sumTwoValues(i,i-1));
        }
    }

    private static void checkOddNumbers() {
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


    public static int sumTwoValues(int a, int b){
        return a + b;
    }
}
