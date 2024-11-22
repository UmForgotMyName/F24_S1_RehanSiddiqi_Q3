import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void testSortTypical() {
        Integer[] input = {3, 1, 4, 1, 5, 9};
        Integer[] expected = {1, 1, 3, 4, 5, 9};
        Integer[] result = BubbleSort.sort(input);
        assertArrayEquals(expected, result, "The array should be sorted in ascending order.");
    }

    @Test
    void testSortEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        Integer[] result = BubbleSort.sort(input);
        assertArrayEquals(expected, result, "An empty array should remain empty.");
    }

    @Test
    void testSortSingleElement() {
        Integer[] input = {42};
        Integer[] expected = {42};
        Integer[] result = BubbleSort.sort(input);
        assertArrayEquals(expected, result, "A single-element array should remain unchanged.");
    }

    @Test
    void testSortAllSameElements() {
        Integer[] input = {7, 7, 7, 7, 7};
        Integer[] expected = {7, 7, 7, 7, 7};
        Integer[] result = BubbleSort.sort(input);
        assertArrayEquals(expected, result, "An array with all identical elements should remain unchanged.");
    }

    @Test
    void testSortNegativeNumbers() {
        Integer[] input = {3, -1, 4, -1, 5, 9};
        Integer[] expected = {-1, -1, 3, 4, 5, 9};
        Integer[] result = BubbleSort.sort(input);
        assertArrayEquals(expected, result, "The array with negative numbers should be sorted correctly.");
    }

    @Test
    void testSortAlreadySorted() {
        Integer[] input = {1, 2, 3, 4, 5, 6};
        Integer[] expected = {1, 2, 3, 4, 5, 6};
        Integer[] result = BubbleSort.sort(input);
        assertArrayEquals(expected, result, "An already sorted array should remain unchanged.");
    }
}
