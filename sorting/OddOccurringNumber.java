public class OddOccurringNumber {

    public static void main(String[] args) {
        int[] arr = {3,3,5,5,6,6,5,6,8,8,7,7,1,1,22,22};
        int  n = arr.length;
        int res = 0;
        for(int  i = 0 ; i < n ; i++)
        {
            res =res ^ arr[i];
        }
        System.out.println("result = "+res);

        int res1 = 0;
        int res2 = 0;

        //To get last set bit from left side for 11 its 1, for 10 it is 2 and for 100 its 4
        int  k = res & (~(res-1));

        for(int i = 0 ; i < n ; i++)
        {
            if((k & arr[i]) != 0)
            {
                res1 = res1 ^ arr[i];
            }
            else
            {
                res2 = res2 ^ arr[i];
            }
        }
        System.out.println("Final result = "+res1 + "," + res2);
    }
}
