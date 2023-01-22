package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String>
                firstResultSet = new HashSet<>(firstSet),
                secondResultSet = new HashSet<>(thirdSet);

        firstResultSet.retainAll(secondSet);
        secondResultSet.removeAll(firstSet);
        secondResultSet.removeAll(secondSet);
        firstResultSet.removeAll(thirdSet);
        firstResultSet.addAll(secondResultSet);
        return firstResultSet;
    }
}
