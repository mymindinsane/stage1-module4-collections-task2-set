package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        result.addAll(thirdSet);
        firstSet.retainAll(secondSet);
        result.addAll(firstSet);
        return result;
    }
}
