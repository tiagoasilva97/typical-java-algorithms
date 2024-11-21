package math;
import exercises.Exercise;

public class MathExercises implements Exercise {

    @Override
    public void executeAll() {
        swapNumbers();
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
}
