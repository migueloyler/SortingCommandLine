
/**
 * A simple implementation of MergeSort
 * left and right sub-arrays are created in the merge method instead of the sort method
 *
 * @author Miguel
 * @version 
 */
public class MegeSort
{
    // recursively splits array and merges
    void sort(int arr[], int start, int end) 
    { 
        if (start < end) 
        { 
            // Find the middle point 
            int mid = (start + end) / 2; 
  
            
            sort(arr, start, mid); 
            sort(arr , mid + 1, end); 
  
            
            merge(arr, start, end, mid); 
        } 
    } 
    
    //Merges Two sub-arrays
    void merge(int arr[], int start, int end, int mid) 
    { 
        
        int leftSize = mid - start + 1; 
        int rightSize = end - mid; 

        int Left[] = new int [leftSize]; 
        int Right[] = new int [rightSize]; 
        
        //create left and right sub-arrays
        for (int i = 0; i < leftSize; i++) {
            Left[i] = arr[start + i]; 
        }
        for (int j = 0; j < rightSize; j++) {
            Right[j] = arr[mid + 1 + j]; 
        }
  
        int i = 0; 
        int j = 0; 
        int k = start; 
        
        while (i < leftSize && j < rightSize) 
        { 
            if (Left[i] <= Right[j]) 
            { 
                arr[k] = Left[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = Right[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < leftSize) 
        { 
            arr[k] = Left[i]; 
            i++; 
            k++; 
        } 
        while (j < rightSize) 
        { 
            arr[k] = Right[j]; 
            j++; 
            k++; 
        } 
    } 
}
