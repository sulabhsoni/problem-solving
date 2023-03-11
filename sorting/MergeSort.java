public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,2,4,9,3,6};
        String s1 = "";
        String s2 = "";

        int farr[] = mergeSortUtil(0, arr.length-1, arr);
        for (int k:farr) {
            System.out.print(k + ",");
        }

}
    private static int[] mergeSortUtil(int s , int e, int[] arr) {
        if(s>= e) return arr;
        int mid = (s+e)/2;
        mergeSortUtil(s, mid, arr);
        mergeSortUtil(mid+1, e, arr);

        int[] aux = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int c=0;
        int l = s;
        while(i<=mid && j<=e) {
            if(arr[i]<=arr[j]) {
                aux[c++] = arr[i];
                i++;
            }
            else {
                aux[c++] = arr[j];
                j++;
            }
        }
        while(i<=mid) {
            aux[c++] = arr[i];
            i++;
        }
        while(j<=e) {
            aux[c++] = arr[j];
            j++;
        }

        for(int p = 0 ; p < (e-s+1) ; p++)
        {
            arr[l++] = aux[p];
        }
        return arr;
    }
}
