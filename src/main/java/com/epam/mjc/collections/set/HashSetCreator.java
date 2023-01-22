package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> ans = new HashSet<>();
        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                while (num % 2 == 0) {
                    ans.add(num);
                    num /= 2;
                }
                ans.add(num);
            } else {
                ans.add(num);
                ans.add(2 * num);
            }
        }

        return ans;
    }
}
