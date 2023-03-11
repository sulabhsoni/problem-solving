
    static ArrayList<Integer> pair_sum_sorted_array(ArrayList<Integer> numbers, Integer target) {
        // Write your code here.
        ArrayList<Integer> result = new ArrayList();
        int start=0;
        int end = numbers.size()-1;
        while(start<end)
        {
            if((numbers.get(start) + numbers.get(end)) < target)
            {
                start++;
            }
            else if((numbers.get(start) + numbers.get(end)) > target)
            {
                end--;
            }
            else
            {
                result.add(start);
                result.add(end);
                return result;
            }
        }
        result.add(-1);
        result.add(-1);
        return result;
        
    }
