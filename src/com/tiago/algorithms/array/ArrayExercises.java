package com.tiago.algorithms.array;

import com.tiago.algorithms.exercise.Exercise;

import java.util.Arrays;

public class ArrayExercises implements Exercise {

    @Override
    public void executeAll(){
        sortingArray();
    }

    private static void sortingArray() {
        System.out.println(" * Sorting Array Exercise");
        int [] numArray = {1,2,6,5,4};
        Arrays.sort(numArray);

        System.out.println("Sorted com.tiago.algorithms.array: " + Arrays.toString(numArray));
    }
}
