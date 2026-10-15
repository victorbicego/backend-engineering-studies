package dev.backendstudies.algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    void findsThePair() {
        assertThat(TwoSum.find(new int[]{2, 7, 11, 15}, 9)).contains(new TwoSum.Pair(0, 1));
    }

    @Test
    void worksWithNegativesAndDuplicates() {
        assertThat(TwoSum.find(new int[]{-3, 4, 3, 90}, 0)).contains(new TwoSum.Pair(0, 2));
        assertThat(TwoSum.find(new int[]{3, 3}, 6)).contains(new TwoSum.Pair(0, 1));
    }

    @Test
    void emptyWhenThereIsNoPair() {
        assertThat(TwoSum.find(new int[]{1, 2, 3}, 100)).isEmpty();
        assertThat(TwoSum.find(new int[]{}, 0)).isEmpty();
    }

    @Test
    void doesNotUseTheSameElementTwice() {
        assertThat(TwoSum.find(new int[]{3, 4}, 6)).isEmpty();
    }
}
