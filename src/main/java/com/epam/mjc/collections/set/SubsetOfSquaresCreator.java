package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> powerOfTwoSet = new TreeSet<>();
        for (Integer i : sourceList) {
            powerOfTwoSet.add((int) Math.pow(i, 2));
        }
        return powerOfTwoSet.subSet(lowerBound, upperBound + 1);
    }
}
