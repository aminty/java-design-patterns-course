package com.company.StructuralPatterns.IteratorPatternChallenge;

public class StudentsClient {
    public static void print(StudentsIterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
