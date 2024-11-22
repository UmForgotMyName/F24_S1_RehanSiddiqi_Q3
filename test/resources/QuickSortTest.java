import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QuickSortTest {

    @Test
    void testEmptyArray() {
        Integer[] arr = new Integer[0];
        Integer[] sorted = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, arr);
        assertEquals(0, sorted.length);
    }

    @Test
    void testSingleElement() {
        Integer[] arr = {1};
        Integer[] sorted = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, arr);
        assertEquals(1, sorted.length);
        assertEquals(1, sorted[0]);
    }

    @Test
    void testSortedArray() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] sorted = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sorted);
    }

    @Test
    void testReverseSortedArray() {
        Integer[] arr = {5, 4, 3, 2, 1};
        Integer[] sorted = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sorted);
    }

    @Test
    void testArrayWithDuplicates() {
        Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        Integer[] sorted = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, arr);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, sorted);
    }

    @Test
    void testDifferentPivotTypes() {
        Integer[] arr = {3, 1, 4, 1, 5};
        Integer[] expected = {1, 1, 3, 4, 5};

        Integer[] arrFirst = arr.clone();
        assertArrayEquals(expected, QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, arrFirst));

        Integer[] arrMiddle = arr.clone();
        assertArrayEquals(expected, QuickSort.sort(QuickSort.PIVOT_TYPE.MIDDLE, arrMiddle));

        Integer[] arrRandom = arr.clone();
        assertArrayEquals(expected, QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, arrRandom));
    }

    @Test
    void testStringArray() {
        String[] arr = {"banana", "apple", "cherry", "date"};
        String[] sorted = QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, arr);
        assertArrayEquals(new String[]{"apple", "banana", "cherry", "date"}, sorted);
    }
}