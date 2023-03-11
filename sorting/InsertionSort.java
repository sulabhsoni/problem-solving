public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,2,4,9,3,6};
        insertionSortUtil(arr);
        for (int k:arr) {
            System.out.print(k + ",");
        }
    }

    private static void insertionSortUtil(int[] arr) {
        for(int  i = 0 ; i < arr.length; i++)
        {
            int temp = arr[i];
            int red = i-1;
            while(red >= 0 && arr[red]>temp)
            {
                arr[red+1] = arr[red];
                red--;
            }
            arr[red+1] = temp;
        }
    }
}
