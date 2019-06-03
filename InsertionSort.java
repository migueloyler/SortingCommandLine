
/**
 * Write a description of class InsertionSort here.
 *
 * @author Miguel
 * @version 
 */
public class InsertionSort
{
    public static void insertionSort(int[] data) {
        for (int numSorted = 1; numSorted < data.length; numSorted++) {
            // take the first unsorted value
            int toInsert = data[numSorted];
            
            // find out where it goes among the sorted elements
            int checkIndex = numSorted - 1;
            while (checkIndex >= 0 && toInsert < data[checkIndex]) {
                // make room for the new value
                data[checkIndex + 1] = data[checkIndex];
                checkIndex--;
            }
            
            // reinsert value
            data[checkIndex + 1] = toInsert;
        }
    }

}
