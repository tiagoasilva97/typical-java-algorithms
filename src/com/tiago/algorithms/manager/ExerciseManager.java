package com.tiago.algorithms.manager;

import com.tiago.algorithms.array.ArrayExercises;
import com.tiago.algorithms.math.MathExercises;
import com.tiago.algorithms.string.StringExercises;

public class ExerciseManager {

    public ExerciseManager(){
        stringExercises();
        mathExercises();
        arrayExercises();
    }

    private void stringExercises(){
        StringExercises stringExercises = new StringExercises();
        stringExercises.executeAll();
    }

    private void mathExercises(){
        MathExercises mathExercises = new MathExercises();
        mathExercises.executeAll();
    }

    private void arrayExercises(){
        ArrayExercises arrayExercises = new ArrayExercises();
        arrayExercises.executeAll();
    }
}
