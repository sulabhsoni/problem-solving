public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0, 9,3,8,1,6};
        selectionSortUtil(arr);
    }

    private static void selectionSortUtil(int[] arr) {
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            int index = i;
            int min = arr[i];
            for(int j = i+1; j < arr.length ; j++) {
                if(min > arr[j] ) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int k: arr) {
            System.out.println(k);
        }

    }
}
