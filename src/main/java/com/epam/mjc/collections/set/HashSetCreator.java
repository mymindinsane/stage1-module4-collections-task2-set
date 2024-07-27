package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) % 2 == 0) {
                hashSet.add(sourceList.get(i));
                int oddCounter = 0;
                int numberToCompare = sourceList.get(i);
                while (numberToCompare % 2 == 0) {
                    hashSet.add(sourceList.get(i) / (2 + oddCounter));
                    numberToCompare = sourceList.get(i) / (2 + oddCounter);
                    oddCounter += 2;
                }
            } else {
                hashSet.add(sourceList.get(i));
                hashSet.add(sourceList.get(i) * 2);
            }
        }
        return hashSet;
    }
}
