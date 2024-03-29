public abstract class Sortable {
  public abstract int compare(Sortable b);
  public static void shellSort(Sortable[] a){
    /** 
     * Algoritma di bawah ini diambil dari website
     * https://www.geeksforgeeks.org/shellsort/
     */
    int n = a.length; 
    for (int gap = n/2; gap > 0; gap /= 2) { 
      for (int i = gap; i < n; i += 1) { 
        Sortable temp = a[i]; 
        int j; 
        for (j = i; j >= gap && a[j - gap].compare(temp) == -1; j -= gap) 
          a[j] = a[j - gap]; 
          a[j] = temp; 
        } 
      } 
  }
}