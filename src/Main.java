import array.ArrayExercises;
import exercises.Exercise;
import math.MathExercises;
import string.StringExercises;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MathExercises mathExercises = new MathExercises();
        mathExercises.executeAll();

        StringExercises stringExercises = new StringExercises();
        stringExercises.executeAll();

        ArrayExercises arrayExercises = new ArrayExercises();
        arrayExercises.executeAll();
    }

}