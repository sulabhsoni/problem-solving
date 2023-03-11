
    static ArrayList<Integer> two_sum(ArrayList<Integer> numbers, Integer target) {
        // Write your code here.
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new  HashMap<Integer, Integer>();
       
        for(int i = 0 ; i < numbers.size() ; i++)
        {
           if( map.containsKey(target-numbers.get(i))  )
           {
               result.add(i);
               result.add(map.get(target-numbers.get(i)));
               return result;
           }
           else
           {
               map.put(numbers.get(i), i);
           }
        }
        result.add(-1);
        result.add(-1);
        return result;
        
        
    }
