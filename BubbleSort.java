
/**
 * A Demo of bubble sort
 *
 * @author Eric Chown
 * @version 3/20/18
 */
public class BubbleSort
{
    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    
    public static void bubbleSort(int[] data) {
        // each pass over the array sorts the next largest element
        for (int numSorted = 0; numSorted < data.length; numSorted++) {
            // bubble next-largest element to the end
            for (int i = 1; i < data.length - numSorted; i++) {
                if (data[i - 1] > data[i]) {
                    swap(data, i - 1, i);
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSortDemo(10, 100);
    }
    
    /**
     * Runs a demo of bubble sort (same algorithm as above, but uses the SortSim
     * class to display the steps of the sort).
     */
    public static void bubbleSortDemo(int dataSize, int maxVal) {
        SortSim s = new SortSim(dataSize, maxVal);
        int[] data = s.getData();

        s.update(false, -1, -1, "starting bubble sort");
        // each pass over the array sorts the next largest element
        for (int numSorted = 0; numSorted < data.length; numSorted++) {
            // bubble a large element to higher array index 
            for (int i = 1; i < data.length - numSorted; i++) {
                s.update(false, i - 1, i, "checking " + data[i - 1] + " and " + data[i]);
                if (data[i - 1] > data[i]) {
                    swap(data, i - 1, i);
                    s.update(true, i - 1, i, "swapped " + data[i] + " and " + data[i - 1]);
                } else {
                    s.update(false, i - 1, i, "pair already in order");
                }
            }

        }
        s.finish();
    }
}
