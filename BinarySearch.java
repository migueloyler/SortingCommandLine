
/**
 * Demo of BinarySearch on an array of ints
 *
 * @author Eric Chown
 * @version 3/20/18
 */
public class BinarySearch
{
    /**
     * Perform a binary search in an int array, looking for given value
     * 
     * @param a      The array of ints to search
     * @param value  The value to search for
     * 
     * @return The position of the desired value. Return -1 if not found.
     */
    public static int binarySearch(int[] a, int value) {
        int start = 0;
        int end = a.length - 1;
        
        while (start <= end) {
            int middle = (start + end) / 2;
            if (value == a[middle]) {
                return middle;
            } else if (value < a[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            
        }
        return -1; // not found
    }
    
    /**
     * For comparison, a standard linear search.
     * 
     * @param a      The array of ints to search
     * @param value  The value to search for
     * 
     * @return The position of the desired value. Return -1 if not found.
     */
    public static int linearSearch(int[] a, int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9}; // has to be sorted for binary search
        System.out.println(binarySearch(a, 7));
    }
}
