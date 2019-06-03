
/**
 * Write a description of class SelectionSort here.
 *
 * @author Miguel
 * @version
 */
public class SelectionSort
{
    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    
    public static void selectionSort(int[] data) {
        for (int unsorted = data.length; unsorted > 0; unsorted--) {
            int largest = 0; // index of largest value this pass
            for (int i = 1; i < unsorted; i++) {
                if (data[largest] < data[i]) {
                    largest = i; // found a new index of largest
                }
            }
            swap(data, largest, unsorted - 1);
            
        }
    }

}
