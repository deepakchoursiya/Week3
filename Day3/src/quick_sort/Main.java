package quick_sort;

 public  class Main
 {
     public static void main(String[] args)
     {
         int[] arr = {10, 7, 8, 9, 1, 5};
         int n = arr.length;

         QuickSort.quickSort(arr, 0, n - 1);

         for (int val : arr)
         {
             System.out.print(val + " ");
         }
     }
 }
