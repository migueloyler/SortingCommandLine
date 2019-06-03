
/**
 * Write a description of class QuickSort here.
 *
 * @author Miguel
 * @version
 */
public class QuickSort
{
    //driver method for quickSort
    void sort(int toSort[], int start, int end) 
    { 
        if (start < end) 
        { 
            int pivotPosition = partition(toSort, start, end); 
  
            sort(toSort, start, pivotPosition - 1); 
            sort(toSort, pivotPosition + 1, end); 
        } 
    } 
    
    //partitioning method
    //choose element at end of list as pivot
    //place all elements smaller than pivot to left of pivot and all elements bigger to right of pivot
    //returns position of pivot
    int partition(int toSort[], int start, int end) 
    { 
        int pivot = toSort[end];  
        int i = (start - 1);
        
        for (int j = start; j < end; j++) 
        { 
            // check if current element is smaller than pivot
            if (toSort[j] <= pivot) 
            { 
                i++; 
                // swaps element since we know it is smaller than pivot
                int temp = toSort[i]; 
                toSort[i] = toSort[j]; 
                toSort[j] = temp; 
            } 
        } 
  
        // place pivot in correct location and return position of pivot
        int temp = toSort[i+1]; 
        toSort[i+1] = toSort[end]; 
        toSort[end] = temp; 
  
        return i+1; 
    } 
  
  
}
