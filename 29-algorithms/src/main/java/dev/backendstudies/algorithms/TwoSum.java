package dev.backendstudies.algorithms;

import java.util.HashMap;
import java.util.Optional;

/**
 * Pattern: hash map as "memory of what I have already seen".
 * Time O(n), space O(n). Brute force would be O(n²).
 */
public final class TwoSum {

    private TwoSum() {}

    public record Pair(int i, int j) {}

    public static Optional<Pair> find(int[] numbers, int target) {
        var seen = new HashMap<Integer, Integer>(); // value -> index
        for (int j = 0; j < numbers.length; j++) {
            Integer i = seen.get(target - numbers[j]);
            if (i != null) {
                return Optional.of(new Pair(i, j));
            }
            seen.put(numbers[j], j);
        }
        return Optional.empty();
    }
}
