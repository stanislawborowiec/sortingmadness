package pl.put.poznan.sortingapp.logic;

/**
 * Klasa bedaca implementacja algorytmu sortujacego HeapSort.
 */

public class HeapSort {
    
    /**
    *Główna funkcja sortująca
    * @param arr zmienna reprezentująca liste do posortowania
    */
    
    public void sort(int arr[])
    {
        int N = arr.length;

        
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        
        for (int i = N - 1; i > 0; i--) {
            
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            
            heapify(arr, i, 0);
        }
    }
    
    /**
    *Główna funkcja sortująca
    * @param arr zmienna reprezentująca liste do posortowania
    * @param N zmienna reprezentująca liczbę wykorzystywaną do sortowania 
    * @param i zmienna reprezentująca liczbę wykorzystywaną do sortowania
    */
    
    public void heapify(int arr[], int N, int i)
    {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 

        
        if (l < N && arr[l] > arr[largest])
            largest = l;

        
        if (r < N && arr[r] > arr[largest])
            largest = r;

        
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            
            heapify(arr, N, largest);
        }
    }
    
    /**
    *Funkcja wypisująca naszą liste
    * @param arr zmienna reprezentująca listę
    */
    
    public static void printArray(int arr[])
    {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

   
}
