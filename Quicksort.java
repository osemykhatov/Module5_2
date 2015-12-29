package Module5_1;

public class Quicksort {

    ///quick sort method takes 3 parameters : array, left value, right value
    public static void quickSort (int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int temp;
        int pivot = arr[(left + right)/2];
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot )
                j--;
            if (i <= j) {

                temp= arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j)
            quickSort(arr, left, j);
        if (i < right)
            quickSort(arr, i, right);

    }

    //  display method to display contents from an array
   public static void display(int[] arr ){
       for (int i = 0; i < arr.length; ++i) {
           System.out.println(arr[i]);
       }
   }

    // CREATE AN ARRAY

    public static void main(String[] args) {

        int[] data = new int [] {5, 10, 100, 9, 8, 3, 6, 7, 2, 1 };
        System.out.println("unsorted array: ");
        display(data);
        quickSort (data, 0, data.length-1);  // CALL QUICKSORT METHOD TO SORT AN ARRAY
        System.out.println("Sorted array:");
        display(data);
    }




}
