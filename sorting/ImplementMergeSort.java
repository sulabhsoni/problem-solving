
    static ArrayList<Integer> merge_sort(ArrayList<Integer> arr) {
        
        mergehelper(arr, 0, arr.size()-1);
        return arr;
    }
    static void mergehelper(ArrayList<Integer> arr, int s1, int e1) {
        if(s1 <  e1) {
            int mid = s1 + (e1-s1)/2;
            mergehelper(arr, s1, mid);
            mergehelper(arr, mid+1, e1);
            merge(arr, s1, mid, e1);
        }
        
    }
    
    static void merge(ArrayList<Integer> arr, int s, int mid, int e) {
        ArrayList<Integer> list = new ArrayList<Integer>(e-s+1);
        int  i = s;
        int j = mid+1;
        while(i <= mid && j <= e)
        {
            if(arr.get(i) <= arr.get(j)){
                list.add(arr.get(i));
                i++;
            }
            else{
                 list.add(arr.get(j));
                 j++;
            }
        }
        while(i <= mid) {
             list.add(arr.get(i));
             i++;
        }
        while(j <= e) {
             list.add(arr.get(j));
             j++;
        }
        for(int  p = s ; p <= e ; p++){
            arr.set(p, list.get(p-s));
        }
    }
