
    static Integer can_attend_all_meetings(ArrayList<ArrayList<Integer>> intervals) {
        // Write your code here.
        
        Comparator<ArrayList<Integer>> myComparator = new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> a1, ArrayList<Integer> a2) {
                return a1.get(0)-a2.get(0);
            }
        };
        
        Collections.sort(intervals, myComparator);
        
        for(int index = 1; index < intervals.size(); index++)
        {
            
            if(intervals.get(index).get(0) < intervals.get(index-1).get(1))
            {
                return 0;
            }
        }
        return 1;
    }
