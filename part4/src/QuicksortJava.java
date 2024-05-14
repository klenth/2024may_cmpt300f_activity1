import java.util.Random;

public class QuicksortJava {

    public static void quicksort(int[] numbers) {
        quicksort(numbers, 0, numbers.length);
    }

    // quicksort numbers on interval [a, b)
    private static void quicksort(int[] numbers, int a, int b) {
        // number of elements being sorted
        int n = b - a;

        if (n < 2)
            // already sorted
            return;

        // pivot: initially the first element
        int piv = a;

        // look at each element in turn — if it's smaller than the pivot element, then
        // swap stuff around to put it on the left of the pivot
        for (int i = a + 1; i < b; ++i) {
            if (numbers[i] < numbers[piv]) {
                swap(numbers, piv + 1, i);
                swap(numbers, piv, piv + 1);
                ++piv;
            }
        }

        // Now everything smaller than the pivot element is before it, and everything larger is after it.
        // Reecursively sort the smaller & larger halves.
        quicksort(numbers, a, piv);
        quicksort(numbers, piv + 1, b);
    }

    // swap numbers[x] with numbers[y]
    private static void swap(int[] numbers, int x, int y) {
        int temp = numbers[x];
        numbers[x] = numbers[y];
        numbers[y] = temp;
    }

    private static void print(int[] numbers) {
        for (int n : numbers)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = new int[200];
        Random rand = new Random(0);

        for (int i = 0; i < data.length; ++i)
            data[i] = rand.nextInt(100);

        System.out.print("Original array:\n\t");
        print(data);
        quicksort(data);
        System.out.print("After sorting:\n\t");
        print(data);
    }
}
